package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.AcessoUsuarioEstabelecimento;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioEstabelecimentoExample;
import br.inf.orion.eSafe.client.model.mapper.AcessoUsuarioEstabelecimentoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class AcessoUsuarioEstabelecimentoServiceDao {
	public static void save(int idCliente, AcessoUsuarioEstabelecimento acessoUsuarioEstabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioEstabelecimentoMapper mapper = session.getMapper(AcessoUsuarioEstabelecimentoMapper.class);
		mapper.insert(acessoUsuarioEstabelecimento);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, AcessoUsuarioEstabelecimento id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioEstabelecimentoMapper mapper = session.getMapper(AcessoUsuarioEstabelecimentoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<AcessoUsuarioEstabelecimento> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioEstabelecimentoMapper mapper = session.getMapper(AcessoUsuarioEstabelecimentoMapper.class);
		AcessoUsuarioEstabelecimentoExample filter = new AcessoUsuarioEstabelecimentoExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<AcessoUsuarioEstabelecimento> acessoUsuarioEstabelecimentos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioEstabelecimentos;
	}

	public static List<AcessoUsuarioEstabelecimento> getByEstabelecimento(int idCliente, int idEstabelecimento) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioEstabelecimentoMapper mapper = session.getMapper(AcessoUsuarioEstabelecimentoMapper.class);
		AcessoUsuarioEstabelecimentoExample filter = new AcessoUsuarioEstabelecimentoExample();
		filter.createCriteria().andIdEstabelecimentoEqualTo(idEstabelecimento);
		List<AcessoUsuarioEstabelecimento> acessoUsuarioEstabelecimentos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioEstabelecimentos;
	}

	public static List<AcessoUsuarioEstabelecimento> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioEstabelecimentoMapper mapper = session.getMapper(AcessoUsuarioEstabelecimentoMapper.class);
		List<AcessoUsuarioEstabelecimento> acessoUsuarioEstabelecimentos = mapper.selectByExample(new AcessoUsuarioEstabelecimentoExample());
		session.commit();
		session.close();
		return acessoUsuarioEstabelecimentos;
	}

}
