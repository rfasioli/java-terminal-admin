package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Perfil;
import br.inf.orion.eSafe.model.mapper.PerfilMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;


public class PerfilServiceDao {
	public static void save(Perfil perfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		PerfilMapper mapper = session.getMapper(PerfilMapper.class);
		mapper.insert(perfil);
		session.commit();
		session.close();
	}

	public static void update(Perfil perfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		PerfilMapper mapper = session.getMapper(PerfilMapper.class);
		mapper.update(perfil);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		PerfilMapper mapper = session.getMapper(PerfilMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static Perfil getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		PerfilMapper mapper = session.getMapper(PerfilMapper.class);
		Perfil perfil = mapper.getById(id);
		session.commit();
		session.close();
		return perfil;
	}

	public static List<Perfil> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		PerfilMapper mapper = session.getMapper(PerfilMapper.class);
		List<Perfil> perfis = mapper.getAll();
		session.commit();
		session.close();
		return perfis;
	}
	
}
