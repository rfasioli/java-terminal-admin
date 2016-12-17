package br.inf.orion.eSafe.service.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Cliente;
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
	
	public static List<Cliente> getByIdNotIn(List<Integer> ids) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		//TODO - implementar not in no mapper (o que está lá não funciona)
		List<Cliente> clientes = mapper.getAll();
		List<Cliente> clientesnotin = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (!ids.contains(cliente.getId())) {
				clientesnotin.add(cliente);
			}
		}
		session.commit();
		session.close();
		return clientesnotin;
	}

	public static List<Cliente> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper mapper = session.getMapper(ClienteMapper.class);
		List<Cliente> clientes = mapper.getAll();
		session.commit();
		session.close();
		return clientes;
	}

//	private static int[] convertIntegers(List<Integer> integers)
//	{
//	    int[] ret = new int[integers.size()];
//	    Iterator<Integer> iterator = integers.iterator();
//	    for (int i = 0; i < ret.length; i++)
//	    {
//	        ret[i] = iterator.next().intValue();
//	    }
//	    return ret;
//	}
}
