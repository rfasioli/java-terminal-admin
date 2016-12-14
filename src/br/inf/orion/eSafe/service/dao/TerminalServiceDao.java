package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Terminal;
import br.inf.orion.eSafe.model.mapper.TerminalMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class TerminalServiceDao {
	public static void save(Terminal terminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.insert(terminal);
		session.commit();
		session.close();
	}

	public static void update(Terminal terminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.update(terminal);
		session.commit();
		session.close();
	}
	
	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.deleteById(id);
		session.commit();
		session.close();
	}

	public static List<Terminal> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		List<Terminal> terminals = mapper.getAll();
		session.commit();
		session.close();
		return terminals;
	}

	public static Terminal getByTerminal(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		Terminal terminal = mapper.getById(id);
		session.commit();
		session.close();
		return terminal;
	}

	public static List<Terminal> getByClient(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		List<Terminal> terminal = mapper.getByClient(id);
		session.commit();
		session.close();
		return terminal;
	}
	
}
