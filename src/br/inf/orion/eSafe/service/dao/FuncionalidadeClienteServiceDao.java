package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.FuncionalidadeCliente;
import br.inf.orion.eSafe.model.mapper.FuncionalidadeClienteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FuncionalidadeClienteServiceDao {
	public static void save(FuncionalidadeCliente FuncionalidadeCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		mapper.insert(FuncionalidadeCliente);
		session.commit();
		session.close();
	}

	public static void deleteByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		mapper.deleteByCliente(idCliente);
		session.commit();
		session.close();
	}

	public static void deleteByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		mapper.deleteByFuncionalidade(idFuncionalidade);
		session.commit();
		session.close();
	}

	public static void delete(FuncionalidadeCliente funcionalidadeCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		mapper.deleteUnique(funcionalidadeCliente);
		session.commit();
		session.close();
	}
	
	public static List<FuncionalidadeCliente> getByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		List<FuncionalidadeCliente> FuncionalidadeClientes = mapper.getByCliente(idCliente);
		session.commit();
		session.close();
		return FuncionalidadeClientes;
	}

	public static List<FuncionalidadeCliente> getByIdCliente(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		List<FuncionalidadeCliente> FuncionalidadeClientes = mapper.getByFuncionalidade(idFuncionalidade);
		session.commit();
		session.close();
		return FuncionalidadeClientes;
	}
		
	public static List<FuncionalidadeCliente> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		List<FuncionalidadeCliente> FuncionalidadeClientes = mapper.getAll();
		session.commit();
		session.close();
		return FuncionalidadeClientes;
	}

	public static List<Cliente> getCliByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeClienteMapper mapper = session.getMapper(FuncionalidadeClienteMapper.class);
		List<Cliente> clientes = mapper.getCliByFuncionalidade(idFuncionalidade);
		session.commit();
		session.close();
		return clientes;
	}
}
