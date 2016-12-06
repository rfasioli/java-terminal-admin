package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Estabelecimento;
import br.inf.orion.eSafe.client.model.example.EstabelecimentoExample;
import br.inf.orion.eSafe.client.model.mapper.EstabelecimentoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class EstabelecimentoServiceDao {
	public static void save(int idCliente, Estabelecimento estabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EstabelecimentoMapper mapper = session.getMapper(EstabelecimentoMapper.class);
		mapper.insert(estabelecimento);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Estabelecimento estabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EstabelecimentoMapper mapper = session.getMapper(EstabelecimentoMapper.class);
		mapper.updateByPrimaryKey(estabelecimento);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EstabelecimentoMapper mapper = session.getMapper(EstabelecimentoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Estabelecimento getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EstabelecimentoMapper mapper = session.getMapper(EstabelecimentoMapper.class);
		Estabelecimento estabelecimento = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return estabelecimento;
	}

	public static List<Estabelecimento> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EstabelecimentoMapper mapper = session.getMapper(EstabelecimentoMapper.class);
		List<Estabelecimento> estabelecimentos = mapper.selectByExample(new EstabelecimentoExample());
		session.commit();
		session.close();
		return estabelecimentos;
	}

}
