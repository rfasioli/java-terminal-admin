package br.inf.orion.eSafe.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.FuncionalidadeClienteKey;
import br.inf.orion.eSafe.model.example.ClienteExample;
import br.inf.orion.eSafe.model.example.FuncionalidadeClienteExample;
import br.inf.orion.eSafe.model.mapper.ClienteMapper;
import br.inf.orion.eSafe.model.mapper.FuncionalidadeClienteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FuncionalidadeClienteServiceDao {
	public static void save(FuncionalidadeClienteKey funcionalidadeCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		mapper.insert(funcionalidadeCliente);
		session.commit();
		session.close();
	}

	public static void deleteByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		FuncionalidadeClienteExample filter = new FuncionalidadeClienteExample();
		filter.createCriteria().andIdClienteEqualTo(idCliente);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void deleteByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		FuncionalidadeClienteExample filter = new FuncionalidadeClienteExample();
		filter.createCriteria().andIdFuncionalidadeEqualTo(idFuncionalidade);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void delete(FuncionalidadeClienteKey funcionalidadeCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		mapper.deleteByPrimaryKey(funcionalidadeCliente);
		session.commit();
		session.close();
	}
	
	public static List<FuncionalidadeClienteKey> getByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		FuncionalidadeClienteExample filter = new FuncionalidadeClienteExample();
		filter.createCriteria().andIdClienteEqualTo(idCliente);
		List<FuncionalidadeClienteKey> funcionalidadeClientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return funcionalidadeClientes;
	}

	public static List<FuncionalidadeClienteKey> getByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		FuncionalidadeClienteExample filter = new FuncionalidadeClienteExample();
		filter.createCriteria().andIdFuncionalidadeEqualTo(idFuncionalidade);
		List<FuncionalidadeClienteKey> FuncionalidadeClientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return FuncionalidadeClientes;
	}
		
	public static List<FuncionalidadeClienteKey> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		List<FuncionalidadeClienteKey> FuncionalidadeClientes = mapper.selectByExample(new FuncionalidadeClienteExample());
		session.commit();
		session.close();
		return FuncionalidadeClientes;
	}

	public static List<Cliente> getCliByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		FuncionalidadeClienteExample filter = new FuncionalidadeClienteExample();
		filter.createCriteria().andIdFuncionalidadeEqualTo(idFuncionalidade);
		List<FuncionalidadeClienteKey> funcionalidadeClientes = mapper.selectByExample(filter);
		
		List<Integer> lstClientes = new ArrayList<Integer>();
		for (FuncionalidadeClienteKey funcionalidadeCliente : funcionalidadeClientes) {
			lstClientes.add(funcionalidadeCliente.getIdCliente());
		}
		
		ClienteMapper mapperCliente = session.getMapper(ClienteMapper.class);
		ClienteExample filterCliente = new ClienteExample();
		filterCliente.createCriteria().andIdClienteIn(lstClientes);
		List<Cliente> clientes = mapperCliente.selectByExample(filterCliente);
		
		session.commit();
		session.close();
		return clientes;
	}
}
