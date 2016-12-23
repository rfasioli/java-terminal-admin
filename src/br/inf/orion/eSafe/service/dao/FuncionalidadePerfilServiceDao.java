package br.inf.orion.eSafe.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.FuncionalidadePerfilKey;
import br.inf.orion.eSafe.model.Perfil;
import br.inf.orion.eSafe.model.example.FuncionalidadePerfilExample;
import br.inf.orion.eSafe.model.example.PerfilExample;
import br.inf.orion.eSafe.model.mapper.FuncionalidadePerfilMapper;
import br.inf.orion.eSafe.model.mapper.PerfilMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FuncionalidadePerfilServiceDao {
	public static void save(FuncionalidadePerfilKey funcionalidadePerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		mapper.insert(funcionalidadePerfil);
		session.commit();
		session.close();
	}

	public static void deleteByPerfil(int idPerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		FuncionalidadePerfilExample filter = new FuncionalidadePerfilExample();
		filter.createCriteria().andIdPerfilEqualTo(idPerfil);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void deleteByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		FuncionalidadePerfilExample filter = new FuncionalidadePerfilExample();
		filter.createCriteria().andIdFuncionalidadeEqualTo(idFuncionalidade);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}
	
	public static void delete(FuncionalidadePerfilKey funcionalidadePerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		mapper.deleteByPrimaryKey(funcionalidadePerfil);
		session.commit();
		session.close();
	}

	public static List<FuncionalidadePerfilKey> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		List<FuncionalidadePerfilKey> funcionalidadePerfis = mapper.selectByExample(new FuncionalidadePerfilExample());
		session.commit();
		session.close();
		return funcionalidadePerfis;
	}

	public static List<FuncionalidadePerfilKey> getByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		FuncionalidadePerfilExample filter = new FuncionalidadePerfilExample();
		filter.createCriteria().andIdFuncionalidadeEqualTo(idFuncionalidade);
		List<FuncionalidadePerfilKey> funcionalidadePerfis = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return funcionalidadePerfis;
	}

	public static List<FuncionalidadePerfilKey> getByPerfil(int idPerfil) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		FuncionalidadePerfilExample filter = new FuncionalidadePerfilExample();
		filter.createCriteria().andIdPerfilEqualTo(idPerfil);
		List<FuncionalidadePerfilKey> funcionalidadePerfis = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return funcionalidadePerfis;
	}
	
	public static List<Perfil> getPerfilByFuncionalidade(int idFuncionalidade) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		FuncionalidadePerfilMapper mapper = session.getMapper(FuncionalidadePerfilMapper.class);
		FuncionalidadePerfilExample filter = new FuncionalidadePerfilExample();
		filter.createCriteria().andIdFuncionalidadeEqualTo(idFuncionalidade);
		List<FuncionalidadePerfilKey> funcionalidadePerfis = mapper.selectByExample(filter);

		List<Integer> lstPerfis = new ArrayList<Integer>();
		for (FuncionalidadePerfilKey funcionalidadePerfil : funcionalidadePerfis) {
			lstPerfis.add(funcionalidadePerfil.getIdPerfil());
		}
		
		PerfilMapper mapperPerfil = session.getMapper(PerfilMapper.class);
		PerfilExample filterPerfil = new PerfilExample();
		filterPerfil.createCriteria().andIdPerfilIn(lstPerfis);
		List<Perfil> perfis = mapperPerfil.selectByExample(filterPerfil);
		session.commit();
		session.close();
		return perfis;
	}
	
}
