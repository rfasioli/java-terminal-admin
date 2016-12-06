package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.SistemaCliente;
import br.inf.orion.eSafe.model.mapper.SistemaClienteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class SistemaClienteServiceDao {
	public static void save(SistemaCliente sistemaCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		mapper.insert(sistemaCliente);
		session.commit();
		session.close();
	}

	public static void deleteByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		mapper.deleteByCliente(idCliente);
		session.commit();
		session.close();
	}

	public static void deleteBySistema(int idSistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		mapper.deleteBySistema(idSistema);
		session.commit();
		session.close();
	}
	
	public static void delete(SistemaCliente sistemaCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		mapper.deleteUnique(sistemaCliente);
		session.commit();
		session.close();
	}

	public static List<SistemaCliente> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		List<SistemaCliente> sistemaClientes = mapper.getAll();
		session.commit();
		session.close();
		return sistemaClientes;
	}

	public static List<SistemaCliente> getByFuncionalidade(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		List<SistemaCliente> sistemaClientes = mapper.getByCliente(idCliente);
		session.commit();
		session.close();
		return sistemaClientes;
	}

	public static List<SistemaCliente> getByPerfil(int idSistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		List<SistemaCliente> sistemaClientes = mapper.getBySistema(idSistema);
		session.commit();
		session.close();
		return sistemaClientes;
	}

}
