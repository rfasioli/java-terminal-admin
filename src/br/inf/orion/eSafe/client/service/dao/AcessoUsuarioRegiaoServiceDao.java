package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.AcessoUsuarioRegiao;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioRegiaoExample;
import br.inf.orion.eSafe.client.model.mapper.AcessoUsuarioRegiaoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class AcessoUsuarioRegiaoServiceDao {
	public static void save(int idCliente, AcessoUsuarioRegiao acessoUsuarioRegiao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioRegiaoMapper mapper = session.getMapper(AcessoUsuarioRegiaoMapper.class);
		mapper.insert(acessoUsuarioRegiao);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, AcessoUsuarioRegiao id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioRegiaoMapper mapper = session.getMapper(AcessoUsuarioRegiaoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<AcessoUsuarioRegiao> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioRegiaoMapper mapper = session.getMapper(AcessoUsuarioRegiaoMapper.class);
		AcessoUsuarioRegiaoExample filter = new AcessoUsuarioRegiaoExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<AcessoUsuarioRegiao> acessoUsuarioRegiaos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioRegiaos;
	}

	public static List<AcessoUsuarioRegiao> getByRegiao(int idCliente, int idRegiao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioRegiaoMapper mapper = session.getMapper(AcessoUsuarioRegiaoMapper.class);
		AcessoUsuarioRegiaoExample filter = new AcessoUsuarioRegiaoExample();
		filter.createCriteria().andIdRegiaoEqualTo(idRegiao);
		List<AcessoUsuarioRegiao> acessoUsuarioRegiaos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioRegiaos;
	}

	public static List<AcessoUsuarioRegiao> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioRegiaoMapper mapper = session.getMapper(AcessoUsuarioRegiaoMapper.class);
		List<AcessoUsuarioRegiao> acessoUsuarioRegiaos = mapper.selectByExample(new AcessoUsuarioRegiaoExample());
		session.commit();
		session.close();
		return acessoUsuarioRegiaos;
	}

}
