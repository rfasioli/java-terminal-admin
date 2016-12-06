package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.UsuarioExterno;
import br.inf.orion.eSafe.client.model.example.UsuarioExternoExample;
import br.inf.orion.eSafe.client.model.mapper.UsuarioExternoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioExternoServiceDao {
	public static void save(int idCliente, UsuarioExterno usuarioExterno) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoMapper mapper = session.getMapper(UsuarioExternoMapper.class);
		mapper.insert(usuarioExterno);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, UsuarioExterno usuarioExterno) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoMapper mapper = session.getMapper(UsuarioExternoMapper.class);
		mapper.updateByPrimaryKey(usuarioExterno);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoMapper mapper = session.getMapper(UsuarioExternoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static UsuarioExterno getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoMapper mapper = session.getMapper(UsuarioExternoMapper.class);
		UsuarioExterno usuarioExterno = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return usuarioExterno;
	}

	public static List<UsuarioExterno> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoMapper mapper = session.getMapper(UsuarioExternoMapper.class);
		List<UsuarioExterno> usuarioExternos = mapper.selectByExample(new UsuarioExternoExample());
		session.commit();
		session.close();
		return usuarioExternos;
	}

}
