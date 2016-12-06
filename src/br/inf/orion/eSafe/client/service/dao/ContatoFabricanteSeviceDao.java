package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.ContatoFabricante;
import br.inf.orion.eSafe.client.model.example.ContatoFabricanteExample;
import br.inf.orion.eSafe.client.model.mapper.ContatoFabricanteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ContatoFabricanteSeviceDao {
	public static void save(int idCliente, ContatoFabricante contatoFabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFabricanteMapper mapper = session.getMapper(ContatoFabricanteMapper.class);
		mapper.insert(contatoFabricante);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, ContatoFabricante contatoFabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFabricanteMapper mapper = session.getMapper(ContatoFabricanteMapper.class);
		mapper.updateByPrimaryKey(contatoFabricante);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFabricanteMapper mapper = session.getMapper(ContatoFabricanteMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static ContatoFabricante getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFabricanteMapper mapper = session.getMapper(ContatoFabricanteMapper.class);
		ContatoFabricante contatoFabricante = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return contatoFabricante;
	}

	public static List<ContatoFabricante> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFabricanteMapper mapper = session.getMapper(ContatoFabricanteMapper.class);
		List<ContatoFabricante> contatoFabricantes = mapper.selectByExample(new ContatoFabricanteExample());
		session.commit();
		session.close();
		return contatoFabricantes;
	}

}
