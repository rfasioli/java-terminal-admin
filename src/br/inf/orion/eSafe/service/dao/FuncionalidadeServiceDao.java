package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Funcionalidade;
import br.inf.orion.eSafe.model.mapper.FuncionalidadeMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FuncionalidadeServiceDao {
	public static void save(Funcionalidade Funcionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		mapper.insert(Funcionalidade);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static void update(Funcionalidade funcionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		mapper.update(funcionalidade);
		session.commit();
		session.close();
	}
	
	public static Funcionalidade getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		Funcionalidade Funcionalidade = mapper.getById(id);
		session.commit();
		session.close();
		return Funcionalidade;
	}

	public static List<Funcionalidade> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		List<Funcionalidade> Funcionalidades = mapper.getAll();
		session.commit();
		session.close();
		return Funcionalidades;
	}

}
