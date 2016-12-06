package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.AcessoUsuarioTerminal;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioTerminalExample;
import br.inf.orion.eSafe.client.model.mapper.AcessoUsuarioTerminalMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class AcessoUsuarioTerminalServiceDao {
	public static void save(int idCliente, AcessoUsuarioTerminal acessoUsuarioTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioTerminalMapper mapper = session.getMapper(AcessoUsuarioTerminalMapper.class);
		mapper.insert(acessoUsuarioTerminal);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, AcessoUsuarioTerminal id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioTerminalMapper mapper = session.getMapper(AcessoUsuarioTerminalMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<AcessoUsuarioTerminal> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioTerminalMapper mapper = session.getMapper(AcessoUsuarioTerminalMapper.class);
		AcessoUsuarioTerminalExample filter = new AcessoUsuarioTerminalExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<AcessoUsuarioTerminal> acessoUsuarioTerminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioTerminals;
	}

	public static List<AcessoUsuarioTerminal> getByTerminal(int idCliente, int idTerminal) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioTerminalMapper mapper = session.getMapper(AcessoUsuarioTerminalMapper.class);
		AcessoUsuarioTerminalExample filter = new AcessoUsuarioTerminalExample();
		filter.createCriteria().andIdTerminalEqualTo(idTerminal);
		List<AcessoUsuarioTerminal> acessoUsuarioTerminals = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioTerminals;
	}

	public static List<AcessoUsuarioTerminal> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioTerminalMapper mapper = session.getMapper(AcessoUsuarioTerminalMapper.class);
		List<AcessoUsuarioTerminal> acessoUsuarioTerminals = mapper.selectByExample(new AcessoUsuarioTerminalExample());
		session.commit();
		session.close();
		return acessoUsuarioTerminals;
	}

}
