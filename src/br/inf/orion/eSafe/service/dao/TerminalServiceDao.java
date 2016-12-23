package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Terminal;
import br.inf.orion.eSafe.model.example.TerminalExample;
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
		mapper.updateByPrimaryKey(terminal);
		session.commit();
		session.close();
	}
	
	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<Terminal> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		List<Terminal> terminals = mapper.selectByExample(new TerminalExample());
		session.commit();
		session.close();
		return terminals;
	}

	public static Terminal getByTerminal(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		Terminal terminal = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return terminal;
	}

	public static List<Terminal> getByClient(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		TerminalExample filter = new TerminalExample();
		filter.createCriteria().andIdClienteEqualTo(id);
		List<Terminal> terminal = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return terminal;
	}
	
}
