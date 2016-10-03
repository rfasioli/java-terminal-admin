package br.inf.orion.eSafe.service.dao.master;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.mapper.master.ClienteMapper;
import br.inf.orion.eSafe.model.master.Cliente;
import br.inf.orion.eSafe.util.MyBatisUtil;


public class ClienteServiceDao {
	public static void save(Cliente cliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		mapper.insert(cliente);
		session.commit();
		session.close();
	}

	public static void update(Cliente cliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		mapper.update(cliente);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static Cliente getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		Cliente cliente = mapper.getById(id);
		session.commit();
		session.close();
		return cliente;
	}

	public static List<Cliente> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		List<Cliente> clientes = mapper.getAll();
		session.commit();
		session.close();
		return clientes;
	}
	
}
