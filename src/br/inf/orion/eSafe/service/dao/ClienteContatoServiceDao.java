package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.ClienteContato;
import br.inf.orion.eSafe.model.ClienteContatoKey;
import br.inf.orion.eSafe.model.example.ClienteContatoExample;
import br.inf.orion.eSafe.model.mapper.ClienteContatoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ClienteContatoServiceDao {
	public static void save(ClienteContato clienteContato) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		mapper.insert(clienteContato);
		session.commit();
		session.close();
	}

	public static void update(ClienteContato clienteContato) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		mapper.updateByPrimaryKey(clienteContato);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int idSequencia) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		ClienteContatoKey key = new ClienteContatoKey();
		key.setIdCliente(idCliente);
		key.setIdSequencia(idSequencia);
		mapper.deleteByPrimaryKey(key);
		session.commit();
		session.close();
	}

	public static ClienteContato getByUnique(int idCliente, int idSequencia) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		ClienteContatoKey key = new ClienteContatoKey();
		key.setIdCliente(idCliente);
		key.setIdSequencia(idSequencia);
		ClienteContato clienteContato = mapper.selectByPrimaryKey(key);
		session.commit();
		session.close();
		return clienteContato;
	}

	public static List<ClienteContato> getByIdCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		ClienteContatoExample filter = new ClienteContatoExample();
		filter.createCriteria().andIdClienteEqualTo(id);
		List<ClienteContato> clienteContatos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return clienteContatos;
	}

	public static List<ClienteContato> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		List<ClienteContato> clienteContatos = mapper.selectByExample(new ClienteContatoExample());
		session.commit();
		session.close();
		return clienteContatos;
	}

}
