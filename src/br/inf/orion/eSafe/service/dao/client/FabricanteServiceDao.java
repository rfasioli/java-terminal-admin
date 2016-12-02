package br.inf.orion.eSafe.service.dao.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.client.bkp.Fabricante;
import br.inf.orion.eSafe.model.mapper.client.bkp.FabricanteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FabricanteServiceDao {
	public static void save(Fabricante fabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.insert(fabricante);
		session.commit();
		session.close();
	}

	public static void update(Fabricante fabricante) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.update(fabricante);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static Fabricante getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		Fabricante fabricante = mapper.getById(id);
		session.commit();
		session.close();
		return fabricante;
	}

	public static List<Fabricante> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		List<Fabricante> clienteContatos = mapper.getAll();
		session.commit();
		session.close();
		return clienteContatos;
	}

}
