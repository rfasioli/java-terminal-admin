package br.inf.orion.eSafe.service.dao.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.client.Fabricante;
import br.inf.orion.eSafe.model.client.example.TbFabricanteExample;
import br.inf.orion.eSafe.model.mapper.client.FabricanteMapper;
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
		mapper.updateByPrimaryKey(fabricante);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Fabricante getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		Fabricante fabricante = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return fabricante;
	}

	public static List<Fabricante> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FabricanteMapper mapper = session.getMapper(FabricanteMapper.class);
		List<Fabricante> clienteContatos = mapper.selectByExample(new TbFabricanteExample());
		session.commit();
		session.close();
		return clienteContatos;
	}

}
