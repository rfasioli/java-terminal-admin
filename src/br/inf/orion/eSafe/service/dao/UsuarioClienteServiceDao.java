package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.UsuarioClienteKey;
import br.inf.orion.eSafe.model.example.UsuarioClienteExample;
import br.inf.orion.eSafe.model.mapper.UsuarioClienteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioClienteServiceDao {
	public static void save(UsuarioClienteKey usuarioCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		mapper.insert(usuarioCliente);
		session.commit();
		session.close();
	}

	public static void deleteByCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		UsuarioClienteExample filter = new UsuarioClienteExample();
		filter.createCriteria().andIdClienteEqualTo(id);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void deleteByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		UsuarioClienteExample filter = new UsuarioClienteExample();
		filter.createCriteria().andIdUsuarioEqualTo(id);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}
	
	public static void delete(UsuarioClienteKey usuarioCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		mapper.deleteByPrimaryKey(usuarioCliente);
		session.commit();
		session.close();
	}

	public static List<UsuarioClienteKey> getByCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		UsuarioClienteExample filter = new UsuarioClienteExample();
		filter.createCriteria().andIdClienteEqualTo(id);
		List<UsuarioClienteKey> UsuarioClientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return UsuarioClientes;
	}

	public static List<UsuarioClienteKey> getByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		UsuarioClienteExample filter = new UsuarioClienteExample();
		filter.createCriteria().andIdUsuarioEqualTo(id);
		List<UsuarioClienteKey> UsuarioClientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return UsuarioClientes;
	}

	public static List<UsuarioClienteKey> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioClienteMapper mapper = session.getMapper(UsuarioClienteMapper.class);
		List<UsuarioClienteKey> UsuarioClientes = mapper.selectByExample(new UsuarioClienteExample());
		session.commit();
		session.close();
		return UsuarioClientes;
	}

}
