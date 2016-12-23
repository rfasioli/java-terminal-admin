package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.UsuarioTerminalKey;
import br.inf.orion.eSafe.model.example.UsuarioTerminalExample;
import br.inf.orion.eSafe.model.mapper.UsuarioTerminalMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioTerminalServiceDao {
	public static void save(UsuarioTerminalKey usuarioTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		mapper.insert(usuarioTerminal);
		session.commit();
		session.close();
	}

	public static void deleteByTerminal(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		UsuarioTerminalExample filter = new UsuarioTerminalExample();
		filter.createCriteria().andIdTerminalEqualTo(id);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void deleteByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		UsuarioTerminalExample filter = new UsuarioTerminalExample();
		filter.createCriteria().andIdUsuarioEqualTo(id);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}
	
	public static void delete(UsuarioTerminalKey usuarioTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		mapper.deleteByPrimaryKey(usuarioTerminal);
		session.commit();
		session.close();
	}

	public static List<UsuarioTerminalKey> getByTerminal(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		UsuarioTerminalExample filter = new UsuarioTerminalExample();
		filter.createCriteria().andIdTerminalEqualTo(id);
		List<UsuarioTerminalKey> UsuarioTerminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return UsuarioTerminals;
	}

	public static List<UsuarioTerminalKey> getByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		UsuarioTerminalExample filter = new UsuarioTerminalExample();
		filter.createCriteria().andIdUsuarioEqualTo(id);
		List<UsuarioTerminalKey> UsuarioTerminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return UsuarioTerminals;
	}

	public static List<UsuarioTerminalKey> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		List<UsuarioTerminalKey> UsuarioTerminals = mapper.selectByExample(new UsuarioTerminalExample());
		session.commit();
		session.close();
		return UsuarioTerminals;
	}


}
