package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Modelo;
import br.inf.orion.eSafe.client.model.example.ModeloExample;
import br.inf.orion.eSafe.client.model.mapper.ModeloMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ModeloServiceDao {
	public static void save(int idCliente, Modelo modelo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		mapper.insert(modelo);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Modelo modelo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		mapper.updateByPrimaryKey(modelo);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Modelo getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		Modelo modelo = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return modelo;
	}

	public static List<Modelo> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		List<Modelo> modelos = mapper.selectByExample(new ModeloExample());
		session.commit();
		session.close();
		return modelos;
	}

}
