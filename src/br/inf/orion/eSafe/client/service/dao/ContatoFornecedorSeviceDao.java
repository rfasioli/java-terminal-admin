package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.ContatoFornecedor;
import br.inf.orion.eSafe.client.model.example.ContatoFornecedorExample;
import br.inf.orion.eSafe.client.model.mapper.ContatoFornecedorMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ContatoFornecedorSeviceDao {
	public static void save(int idCliente, ContatoFornecedor contatoFornecedor) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFornecedorMapper mapper = session.getMapper(ContatoFornecedorMapper.class);
		mapper.insert(contatoFornecedor);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, ContatoFornecedor contatoFornecedor) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFornecedorMapper mapper = session.getMapper(ContatoFornecedorMapper.class);
		mapper.updateByPrimaryKey(contatoFornecedor);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFornecedorMapper mapper = session.getMapper(ContatoFornecedorMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static ContatoFornecedor getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFornecedorMapper mapper = session.getMapper(ContatoFornecedorMapper.class);
		ContatoFornecedor contatoFornecedor = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return contatoFornecedor;
	}

	public static List<ContatoFornecedor> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFornecedorMapper mapper = session.getMapper(ContatoFornecedorMapper.class);
		List<ContatoFornecedor> contatoFornecedors = mapper.selectByExample(new ContatoFornecedorExample());
		session.commit();
		session.close();
		return contatoFornecedors;
	}

}
