package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.EnderecoEstabelecimento;
import br.inf.orion.eSafe.client.model.EnderecoEstabelecimentoKey;
import br.inf.orion.eSafe.client.model.example.EnderecoEstabelecimentoExample;
import br.inf.orion.eSafe.client.model.mapper.EnderecoEstabelecimentoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class EnderecoEstabelecimentoServiceDao {
	public static void save(int idCliente, EnderecoEstabelecimento enderecoEstabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EnderecoEstabelecimentoMapper mapper = session.getMapper(EnderecoEstabelecimentoMapper.class);
		mapper.insert(enderecoEstabelecimento);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, EnderecoEstabelecimento id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EnderecoEstabelecimentoMapper mapper = session.getMapper(EnderecoEstabelecimentoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<EnderecoEstabelecimento> getByUsuario(int idCliente, int idEstabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EnderecoEstabelecimentoMapper mapper = session.getMapper(EnderecoEstabelecimentoMapper.class);
		EnderecoEstabelecimentoExample filter = new EnderecoEstabelecimentoExample();
		filter.createCriteria().andIdEstabelecimentoEqualTo(idEstabelecimento);
		List<EnderecoEstabelecimento> enderecoEstabelecimentos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return enderecoEstabelecimentos;
	}

	public static EnderecoEstabelecimento getByRegiao(int idCliente, EnderecoEstabelecimentoKey key) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EnderecoEstabelecimentoMapper mapper = session.getMapper(EnderecoEstabelecimentoMapper.class);
		EnderecoEstabelecimento enderecoEstabelecimento = mapper.selectByPrimaryKey(key);
		session.commit();
		session.close();
		return enderecoEstabelecimento;
	}

	public static List<EnderecoEstabelecimento> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		EnderecoEstabelecimentoMapper mapper = session.getMapper(EnderecoEstabelecimentoMapper.class);
		List<EnderecoEstabelecimento> enderecoEstabelecimentos = mapper.selectByExample(new EnderecoEstabelecimentoExample());
		session.commit();
		session.close();
		return enderecoEstabelecimentos;
	}

}
