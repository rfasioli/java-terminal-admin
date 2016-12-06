package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.ContatoEstabelecimento;
import br.inf.orion.eSafe.client.model.example.ContatoEstabelecimentoExample;
import br.inf.orion.eSafe.client.model.mapper.ContatoEstabelecimentoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ContatoEstabelecimentoSeviceDao {
	public static void save(int idCliente, ContatoEstabelecimento contatoEstabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoEstabelecimentoMapper mapper = session.getMapper(ContatoEstabelecimentoMapper.class);
		mapper.insert(contatoEstabelecimento);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, ContatoEstabelecimento contatoEstabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoEstabelecimentoMapper mapper = session.getMapper(ContatoEstabelecimentoMapper.class);
		mapper.updateByPrimaryKey(contatoEstabelecimento);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoEstabelecimentoMapper mapper = session.getMapper(ContatoEstabelecimentoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static ContatoEstabelecimento getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoEstabelecimentoMapper mapper = session.getMapper(ContatoEstabelecimentoMapper.class);
		ContatoEstabelecimento contatoEstabelecimento = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return contatoEstabelecimento;
	}

	public static List<ContatoEstabelecimento> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoEstabelecimentoMapper mapper = session.getMapper(ContatoEstabelecimentoMapper.class);
		List<ContatoEstabelecimento> contatoEstabelecimentos = mapper.selectByExample(new ContatoEstabelecimentoExample());
		session.commit();
		session.close();
		return contatoEstabelecimentos;
	}

}
