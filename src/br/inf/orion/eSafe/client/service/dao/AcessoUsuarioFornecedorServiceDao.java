package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.AcessoUsuarioFornecedor;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioFornecedorExample;
import br.inf.orion.eSafe.client.model.mapper.AcessoUsuarioFornecedorMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class AcessoUsuarioFornecedorServiceDao {
	public static void save(int idCliente, AcessoUsuarioFornecedor acessoUsuarioFornecedor) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFornecedorMapper mapper = session.getMapper(AcessoUsuarioFornecedorMapper.class);
		mapper.insert(acessoUsuarioFornecedor);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, AcessoUsuarioFornecedor id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFornecedorMapper mapper = session.getMapper(AcessoUsuarioFornecedorMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<AcessoUsuarioFornecedor> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFornecedorMapper mapper = session.getMapper(AcessoUsuarioFornecedorMapper.class);
		AcessoUsuarioFornecedorExample filter = new AcessoUsuarioFornecedorExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<AcessoUsuarioFornecedor> acessoUsuarioFornecedors = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioFornecedors;
	}

	public static List<AcessoUsuarioFornecedor> getByFornecedor(int idCliente, int idFornecedor) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFornecedorMapper mapper = session.getMapper(AcessoUsuarioFornecedorMapper.class);
		AcessoUsuarioFornecedorExample filter = new AcessoUsuarioFornecedorExample();
		filter.createCriteria().andIdFornecedorEqualTo(idFornecedor);
		List<AcessoUsuarioFornecedor> acessoUsuarioFornecedors = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioFornecedors;
	}

	public static List<AcessoUsuarioFornecedor> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFornecedorMapper mapper = session.getMapper(AcessoUsuarioFornecedorMapper.class);
		List<AcessoUsuarioFornecedor> acessoUsuarioFornecedors = mapper.selectByExample(new AcessoUsuarioFornecedorExample());
		session.commit();
		session.close();
		return acessoUsuarioFornecedors;
	}

}
