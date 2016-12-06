package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.UsuarioCliente;
import br.inf.orion.eSafe.model.mapper.UsuarioClienteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioClienteServiceDao {
	public static void save(UsuarioCliente usuarioCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		mapper.insert(usuarioCliente);
		session.commit();
		session.close();
	}

	public static void deleteByCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		mapper.deleteByCliente(id);
		session.commit();
		session.close();
	}

	public static void deleteByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		mapper.deleteByUsuario(id);
		session.commit();
		session.close();
	}
	
	public static void delete(UsuarioCliente usuarioCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		mapper.deleteUnique(usuarioCliente);
		session.commit();
		session.close();
	}

	public static List<UsuarioCliente> getByCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		List<UsuarioCliente> UsuarioClientes = mapper.getByCliente(id);
		session.commit();
		session.close();
		return UsuarioClientes;
	}

	public static List<UsuarioCliente> getByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		List<UsuarioCliente> UsuarioClientes = mapper.getByUsuario(id);
		session.commit();
		session.close();
		return UsuarioClientes;
	}

	public static List<UsuarioCliente> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		List<UsuarioCliente> UsuarioClientes = mapper.getAll();
		session.commit();
		session.close();
		return UsuarioClientes;
	}

}
