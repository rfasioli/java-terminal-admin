package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.UsuarioTerminal;
import br.inf.orion.eSafe.model.mapper.UsuarioTerminalMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioTerminalServiceDao {
	public static void save(UsuarioTerminal usuarioTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		mapper.insert(usuarioTerminal);
		session.commit();
		session.close();
	}

	public static void deleteByTerminal(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		mapper.deleteByTerminal(id);
		session.commit();
		session.close();
	}

	public static void deleteByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		mapper.deleteByUsuario(id);
		session.commit();
		session.close();
	}
	
	public static void delete(UsuarioTerminal usuarioTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		mapper.deleteUnique(usuarioTerminal);
		session.commit();
		session.close();
	}

	public static List<UsuarioTerminal> getByTerminal(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		List<UsuarioTerminal> UsuarioTerminals = mapper.getByTerminal(id);
		session.commit();
		session.close();
		return UsuarioTerminals;
	}

	public static List<UsuarioTerminal> getByUsuario(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		List<UsuarioTerminal> UsuarioTerminals = mapper.getByUsuario(id);
		session.commit();
		session.close();
		return UsuarioTerminals;
	}

	public static List<UsuarioTerminal> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioTerminalMapper mapper = session.getMapper(UsuarioTerminalMapper.class);
		List<UsuarioTerminal> UsuarioTerminals = mapper.getAll();
		session.commit();
		session.close();
		return UsuarioTerminals;
	}


}
