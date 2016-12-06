package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.FuncionalidadePerfil;
import br.inf.orion.eSafe.model.mapper.FuncionalidadePerfilMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FuncionalidadePerfilServiceDao {
	public static void save(FuncionalidadePerfil funcionalidadePerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		mapper.insert(funcionalidadePerfil);
		session.commit();
		session.close();
	}

	public static void deleteByPerfil(int idPerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		mapper.deleteByPerfil(idPerfil);
		session.commit();
		session.close();
	}

	public static void deleteByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		mapper.deleteByFuncionalidade(idFuncionalidade);
		session.commit();
		session.close();
	}
	
	public static void delete(FuncionalidadePerfil funcionalidadePerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		mapper.deleteUnique(funcionalidadePerfil);
		session.commit();
		session.close();
	}

	public static List<FuncionalidadePerfil> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		List<FuncionalidadePerfil> funcionalidadePerfis = mapper.getAll();
		session.commit();
		session.close();
		return funcionalidadePerfis;
	}

	public static List<FuncionalidadePerfil> getByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		List<FuncionalidadePerfil> funcionalidadePerfis = mapper.getByFuncionalidade(idFuncionalidade);
		session.commit();
		session.close();
		return funcionalidadePerfis;
	}

	public static List<FuncionalidadePerfil> getByPerfil(int idPerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		List<FuncionalidadePerfil> funcionalidadePerfis = mapper.getByPerfil(idPerfil);
		session.commit();
		session.close();
		return funcionalidadePerfis;
	}
	
}
