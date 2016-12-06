package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Fabricante;
import br.inf.orion.eSafe.client.model.example.FabricanteExample;
import br.inf.orion.eSafe.client.model.mapper.FabricanteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FabricanteServiceDao {
	public static void save(int idCliente, Fabricante fabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.insert(fabricante);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Fabricante fabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.updateByPrimaryKey(fabricante);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Fabricante getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		Fabricante fabricante = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return fabricante;
	}

	public static List<Fabricante> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		List<Fabricante> clienteContatos = mapper.selectByExample(new FabricanteExample());
		session.commit();
		session.close();
		return clienteContatos;
	}

}
