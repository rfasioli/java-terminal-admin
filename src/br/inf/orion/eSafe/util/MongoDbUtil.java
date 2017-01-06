package br.inf.orion.eSafe.util;

import java.util.Hashtable;
import java.util.Map;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbUtil {
	private static MongoDbUtil instance = null;
	
	//MongoDB Objects
	private MongoClient mongoClient;
	private MongoDatabase mongoDatabase;
	private Map<Integer, MongoDatabase> mongoDatabaseClients;

	//Morphia Objects
	private Morphia morphia;
	private Datastore datastore;
	private Map<Integer, Datastore> datastoreClients;
	
	private MongoDbUtil() {
		try {
			mongoClient = new MongoClient();
			mongoDatabase = mongoClient.getDatabase("eSafe");
			mongoDatabaseClients = new Hashtable<Integer, MongoDatabase>();
			
			morphia = new Morphia();
			morphia.mapPackage("br.inf.orion.eSafe.client.model.mongo");
			datastore = morphia.createDatastore(mongoClient, "eSafe");
			datastore.ensureIndexes();
			datastoreClients = new Hashtable<Integer, Datastore>();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void finalize() {
		instance = null;
		mongoClient.close();
		mongoDatabase = null;
		mongoDatabaseClients.clear();
		datastore = null;
		datastoreClients.clear();
	}
	
	public static MongoDbUtil getInstance() {
		if (instance == null)
			instance = new MongoDbUtil();
		return instance;
	}

		
	public MongoDatabase getMongoDatabase(){
		return mongoDatabase;
	}
	
	public MongoDatabase getMongoDatabase(int idCliente){
		MongoDatabase session = mongoDatabaseClients.get(idCliente);
		if (session == null) {
			session = mongoClient.getDatabase("eSafe_Client_" + idCliente);
			if (session != null) { 
				mongoDatabaseClients.put(idCliente, session);
			}
		}
		return session;		
	}

	
	public Datastore getMorphiaDatastore(){
		return datastore;
	}
	
	public Datastore getMorphiaDatastore(int idCliente){
		Datastore session = datastoreClients.get(idCliente);
		if (session == null) {
			session = morphia.createDatastore(mongoClient, "eSafe_Client_" + idCliente);
			datastore.ensureIndexes();

			if (session != null) { 
				datastoreClients.put(idCliente, session);
			}
		}
		return session;		
	}
	
}
