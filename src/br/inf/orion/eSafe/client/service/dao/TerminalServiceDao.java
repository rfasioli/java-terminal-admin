package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Terminal;
import br.inf.orion.eSafe.client.model.example.TerminalExample;
import br.inf.orion.eSafe.client.model.mapper.TerminalMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class TerminalServiceDao {
	public static void save(int idCliente, Terminal terminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.insert(terminal);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Terminal terminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.updateByPrimaryKey(terminal);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Terminal getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		Terminal terminal = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return terminal;
	}

	public static List<Terminal> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		List<Terminal> terminals = mapper.selectByExample(new TerminalExample());
		session.commit();
		session.close();
		return terminals;
	}

	public static List<Terminal> getByIdNotIn(int idCliente, List<Integer> terminais) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TerminalMapper mapper = session.getMapper(TerminalMapper.class);
		TerminalExample filter = new TerminalExample();
		filter.createCriteria().andIdTerminalNotIn(terminais);
		List<Terminal> terminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return terminals;
	}
	
}
