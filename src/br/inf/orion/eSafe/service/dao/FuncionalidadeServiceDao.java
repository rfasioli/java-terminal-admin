package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Funcionalidade;
import br.inf.orion.eSafe.model.example.FuncionalidadeExample;
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
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static void update(Funcionalidade funcionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		mapper.updateByPrimaryKey(funcionalidade);
		session.commit();
		session.close();
	}
	
	public static Funcionalidade getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		Funcionalidade funcionalidade = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return funcionalidade;
	}

	public static List<Funcionalidade> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		List<Funcionalidade> funcionalidade = mapper.selectByExample(new FuncionalidadeExample());
		session.commit();
		session.close();
		return funcionalidade;
	}

	public static List<Funcionalidade> getRootFeatures() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		FuncionalidadeExample filter = new FuncionalidadeExample();
		filter.createCriteria().andIdFuncionalidadeAnteriorIsNull();
		List<Funcionalidade> funcionalidades = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return funcionalidades;
	}
	
	public static List<Funcionalidade> getByPreviousId(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadeMapper mapper = session.getMapper(FuncionalidadeMapper.class);
		FuncionalidadeExample filter = new FuncionalidadeExample();
		filter.createCriteria().andIdFuncionalidadeAnteriorEqualTo(id);
		List<Funcionalidade> funcionalidades = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return funcionalidades;
	}
	
}
