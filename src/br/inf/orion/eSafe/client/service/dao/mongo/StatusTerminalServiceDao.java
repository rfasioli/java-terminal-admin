package br.inf.orion.eSafe.client.service.dao.mongo;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;

import br.inf.orion.eSafe.client.model.specialized.StatusTerminal;
import br.inf.orion.eSafe.util.MongoDbUtil;

public class StatusTerminalServiceDao {
	
	public static String save(int idCliente, StatusTerminal statusTerminal) {
		Datastore ds = MongoDbUtil.getInstance().getMorphiaDatastore(idCliente);
		br.inf.orion.eSafe.client.model.morphia.StatusTerminal elem = 
				new br.inf.orion.eSafe.client.model.morphia.StatusTerminal(statusTerminal);
		ds.save(elem);
		return elem.getId().toHexString();
	}

	public static List<StatusTerminal> getAll(int idCliente) {
		Datastore ds = MongoDbUtil.getInstance().getMorphiaDatastore(idCliente);
		List<StatusTerminal> result = new ArrayList<StatusTerminal>();
		
		List<br.inf.orion.eSafe.client.model.morphia.StatusTerminal> lstStatusTerminal =
				ds.createQuery(br.inf.orion.eSafe.client.model.morphia.StatusTerminal.class)
					.asList();

		for (br.inf.orion.eSafe.client.model.morphia.StatusTerminal statusTerminal : lstStatusTerminal) {
			result.add(new StatusTerminal(statusTerminal));
		}
		
		return result;
	}

	public static StatusTerminal getById(int idCliente, String id) {
		Datastore ds = MongoDbUtil.getInstance().getMorphiaDatastore(idCliente);
	
		br.inf.orion.eSafe.client.model.morphia.StatusTerminal result = 
				ds.get(br.inf.orion.eSafe.client.model.morphia.StatusTerminal.class, id);
		
		return new StatusTerminal(result);
	}
	
}
