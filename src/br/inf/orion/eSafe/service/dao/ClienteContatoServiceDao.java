package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.ClienteContato;
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
		mapper.update(clienteContato);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static ClienteContato getByUnique(int idCliente, int idSequencia) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		ClienteContato clienteContato = mapper.getUnique(idCliente, idSequencia);
		session.commit();
		session.close();
		return clienteContato;
	}

	public static List<ClienteContato> getByIdCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		List<ClienteContato> clienteContatos = mapper.getByIdCliente(id);
		session.commit();
		session.close();
		return clienteContatos;
	}

	public static List<ClienteContato> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteContatoMapper mapper = session.getMapper(ClienteContatoMapper.class);
		List<ClienteContato> clienteContatos = mapper.getAll();
		session.commit();
		session.close();
		return clienteContatos;
	}

}
