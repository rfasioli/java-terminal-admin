package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.AutenticacaoUsuarioExterno;
import br.inf.orion.eSafe.client.model.example.AutenticacaoUsuarioExternoExample;
import br.inf.orion.eSafe.client.model.mapper.AutenticacaoUsuarioExternoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class AutenticacaoUsuarioExternoServiceDao {
	public static void save(int idCliente, AutenticacaoUsuarioExterno autenticacaoUsuarioExterno) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AutenticacaoUsuarioExternoMapper mapper = session.getMapper(AutenticacaoUsuarioExternoMapper.class);
		mapper.insert(autenticacaoUsuarioExterno);
		session.commit();
		session.close();
	}

	public static void deleteByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AutenticacaoUsuarioExternoMapper mapper = session.getMapper(AutenticacaoUsuarioExternoMapper.class);
		AutenticacaoUsuarioExternoExample filter = new AutenticacaoUsuarioExternoExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void deleteByAutenticacao(int idCliente, String idAutenticacao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AutenticacaoUsuarioExternoMapper mapper = session.getMapper(AutenticacaoUsuarioExternoMapper.class);
		AutenticacaoUsuarioExternoExample filter = new AutenticacaoUsuarioExternoExample();
		filter.createCriteria().andIdAutenticacaoEqualTo(idAutenticacao);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}
	
	public static List<AutenticacaoUsuarioExterno> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AutenticacaoUsuarioExternoMapper mapper = session.getMapper(AutenticacaoUsuarioExternoMapper.class);
		AutenticacaoUsuarioExternoExample filter = new AutenticacaoUsuarioExternoExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<AutenticacaoUsuarioExterno> autenticacaoUsuarioExternos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return autenticacaoUsuarioExternos;
	}

	public static List<AutenticacaoUsuarioExterno> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AutenticacaoUsuarioExternoMapper mapper = session.getMapper(AutenticacaoUsuarioExternoMapper.class);
		List<AutenticacaoUsuarioExterno> autenticacaoUsuarioExternos = mapper.selectByExample(new AutenticacaoUsuarioExternoExample());
		session.commit();
		session.close();
		return autenticacaoUsuarioExternos;
	}

}
