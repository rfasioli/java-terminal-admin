package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Fornecedor;
import br.inf.orion.eSafe.client.model.example.FornecedorExample;
import br.inf.orion.eSafe.client.model.mapper.FornecedorMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FornecedorServiceDao {
	public static void save(int idCliente, Fornecedor fornecedor) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FornecedorMapper mapper = session.getMapper(FornecedorMapper.class);
		mapper.insert(fornecedor);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Fornecedor fornecedor) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FornecedorMapper mapper = session.getMapper(FornecedorMapper.class);
		mapper.updateByPrimaryKey(fornecedor);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FornecedorMapper mapper = session.getMapper(FornecedorMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Fornecedor getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FornecedorMapper mapper = session.getMapper(FornecedorMapper.class);
		Fornecedor fornecedor = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return fornecedor;
	}

	public static List<Fornecedor> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FornecedorMapper mapper = session.getMapper(FornecedorMapper.class);
		List<Fornecedor> fornecedors = mapper.selectByExample(new FornecedorExample());
		session.commit();
		session.close();
		return fornecedors;
	}

}
