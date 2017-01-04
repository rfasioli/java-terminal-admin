package br.inf.orion.eSafe.util;

import java.util.Hashtable;
import java.util.Map;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbUtil {
	private static MongoClient mongoClient;
	private static MongoDatabase mongoDatabase;
	private static Map<Integer, MongoDatabase> mongoDatabaseClients;

	private static Morphia morphia;
	private static Datastore datastore;
	private static Map<Integer, Datastore> datastoreClients;
	
	static {
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
		
	public static MongoDatabase getMongoDatabase(){
		return mongoDatabase;
	}
	
	public static MongoDatabase getMongoDatabase(int idCliente){
		MongoDatabase session = mongoDatabaseClients.get(idCliente);
		if (session == null) {
			session = mongoClient.getDatabase("eSafe_Client_" + idCliente);
			if (session != null) { 
				mongoDatabaseClients.put(idCliente, session);
			}
		}
		return session;		
	}

	
	public static Datastore getMorphiaDatastore(){
		return datastore;
	}
	
	public static Datastore getMorphiaDatastore(int idCliente){
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

	
	public static void Dispose() {
		mongoClient.close();
		mongoDatabase = null;
		mongoDatabaseClients.clear();
	}
	
}
