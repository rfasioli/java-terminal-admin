package br.inf.orion.eSafe.service.dao.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.client.Modelo;
import br.inf.orion.eSafe.model.mapper.client.ModeloMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ModeloServiceDao {
	public static void save(Modelo modelo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		mapper.insert(modelo);
		session.commit();
		session.close();
	}

	public static void update(Modelo modelo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		mapper.update(modelo);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static Modelo getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		Modelo modelo = mapper.getById(id);
		session.commit();
		session.close();
		return modelo;
	}

	public static List<Modelo> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		List<Modelo> clienteContatos = mapper.getAll();
		session.commit();
		session.close();
		return clienteContatos;
	}

	public static List<Modelo> getByFabricante( int id_fabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ModeloMapper mapper = session.getMapper(ModeloMapper.class);
		List<Modelo> clienteContatos = mapper.getByFabricante(id_fabricante);
		session.commit();
		session.close();
		return clienteContatos;
	}
	
}
