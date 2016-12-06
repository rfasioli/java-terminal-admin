package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.UsuarioExternoTerminalKey;
import br.inf.orion.eSafe.client.model.example.UsuarioExternoTerminalExample;
import br.inf.orion.eSafe.client.model.mapper.UsuarioExternoTerminalMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioExternoTerminalServiceDao {
	public static void save(int idCliente, UsuarioExternoTerminalKey usuarioExternoTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoTerminalMapper mapper = session.getMapper(UsuarioExternoTerminalMapper.class);
		mapper.insert(usuarioExternoTerminal);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, UsuarioExternoTerminalKey id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoTerminalMapper mapper = session.getMapper(UsuarioExternoTerminalMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<UsuarioExternoTerminalKey> getByTerminal(int idCliente, int idTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoTerminalMapper mapper = session.getMapper(UsuarioExternoTerminalMapper.class);
		UsuarioExternoTerminalExample filter = new UsuarioExternoTerminalExample();
		filter.createCriteria().andIdTerminalEqualTo(idTerminal);
		List<UsuarioExternoTerminalKey> usuarioExternoTerminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return usuarioExternoTerminals;
	}

	public static List<UsuarioExternoTerminalKey> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoTerminalMapper mapper = session.getMapper(UsuarioExternoTerminalMapper.class);
		UsuarioExternoTerminalExample filter = new UsuarioExternoTerminalExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<UsuarioExternoTerminalKey> usuarioExternoTerminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return usuarioExternoTerminals;
	}

	public static List<UsuarioExternoTerminalKey> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		UsuarioExternoTerminalMapper mapper = session.getMapper(UsuarioExternoTerminalMapper.class);
		List<UsuarioExternoTerminalKey> usuarioExternoTerminals = mapper.selectByExample(new UsuarioExternoTerminalExample());
		session.commit();
		session.close();
		return usuarioExternoTerminals;
	}

}
