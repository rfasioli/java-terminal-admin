package br.inf.orion.eSafe.client.service.dao.mongo;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;

import br.inf.orion.eSafe.client.model.specialized.StatusTerminal;
import br.inf.orion.eSafe.util.MongoDbUtil;

public class StatusTerminalServiceDao {
	
	public static String save(int idCliente, StatusTerminal statusTerminal) {
		//MongoDatabase db = MongoDbUtil.getMongoDatabase(idCliente);
		//db.getCollection("StatusDispositivo").insertOne(new Document(statusDispositivo));
		Datastore ds = MongoDbUtil.getMorphiaDatastore(idCliente);
		br.inf.orion.eSafe.client.model.mongo.StatusTerminal elem = 
				new br.inf.orion.eSafe.client.model.mongo.StatusTerminal(statusTerminal);
		ds.save(elem);
		return elem.getId().toHexString();
	}

	public static List<StatusTerminal> getAll(int idCliente) {
		Datastore ds = MongoDbUtil.getMorphiaDatastore(idCliente);
		List<StatusTerminal> result = new ArrayList<StatusTerminal>();
		
		List<br.inf.orion.eSafe.client.model.mongo.StatusTerminal> lstStatusTerminal =
				ds.createQuery(br.inf.orion.eSafe.client.model.mongo.StatusTerminal.class)
					.asList();

		for (br.inf.orion.eSafe.client.model.mongo.StatusTerminal statusTerminal : lstStatusTerminal) {
			result.add(new StatusTerminal(statusTerminal));
		}
		
		return result;
	}
	
}
