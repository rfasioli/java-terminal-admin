package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Regiao;
import br.inf.orion.eSafe.client.model.example.RegiaoExample;
import br.inf.orion.eSafe.client.model.mapper.RegiaoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class RegiaoServiceDao {
	public static void save(int idCliente, Regiao regiao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		RegiaoMapper mapper = session.getMapper(RegiaoMapper.class);
		mapper.insert(regiao);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Regiao regiao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		RegiaoMapper mapper = session.getMapper(RegiaoMapper.class);
		mapper.updateByPrimaryKey(regiao);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		RegiaoMapper mapper = session.getMapper(RegiaoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Regiao getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		RegiaoMapper mapper = session.getMapper(RegiaoMapper.class);
		Regiao regiao = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return regiao;
	}

	public static List<Regiao> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		RegiaoMapper mapper = session.getMapper(RegiaoMapper.class);
		List<Regiao> regiaos = mapper.selectByExample(new RegiaoExample());
		session.commit();
		session.close();
		return regiaos;
	}

}
