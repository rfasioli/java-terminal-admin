package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.example.ClienteExample;
import br.inf.orion.eSafe.model.mapper.ClienteMapper;
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
		mapper.updateByPrimaryKey(cliente);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Cliente getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		Cliente cliente = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return cliente;
	}
	
	public static List<Cliente> getByIdNotIn(List<Integer> ids) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		ClienteExample filter = new ClienteExample();
		filter.createCriteria().andIdClienteNotIn(ids);
		List<Cliente> clientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return clientes;
	}

	public static List<Cliente> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		List<Cliente> clientes = mapper.selectByExample(new ClienteExample());
		session.commit();
		session.close();
		return clientes;
	}

	}
