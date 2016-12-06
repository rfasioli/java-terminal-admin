package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.AcessoUsuarioFilial;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioFilialExample;
import br.inf.orion.eSafe.client.model.mapper.AcessoUsuarioFilialMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class AcessoUsuarioFilialServiceDao {
	public static void save(int idCliente, AcessoUsuarioFilial acessoUsuarioFilial) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFilialMapper mapper = session.getMapper(AcessoUsuarioFilialMapper.class);
		mapper.insert(acessoUsuarioFilial);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, AcessoUsuarioFilial id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFilialMapper mapper = session.getMapper(AcessoUsuarioFilialMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<AcessoUsuarioFilial> getByUsuario(int idCliente, int idUsuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFilialMapper mapper = session.getMapper(AcessoUsuarioFilialMapper.class);
		AcessoUsuarioFilialExample filter = new AcessoUsuarioFilialExample();
		filter.createCriteria().andIdUsuarioEqualTo(idUsuario);
		List<AcessoUsuarioFilial> acessoUsuarioFilials = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioFilials;
	}

	public static List<AcessoUsuarioFilial> getByFilial(int idCliente, int idFilial) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFilialMapper mapper = session.getMapper(AcessoUsuarioFilialMapper.class);
		AcessoUsuarioFilialExample filter = new AcessoUsuarioFilialExample();
		filter.createCriteria().andIdFilialEqualTo(idFilial);
		List<AcessoUsuarioFilial> acessoUsuarioFilials = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return acessoUsuarioFilials;
	}

	public static List<AcessoUsuarioFilial> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		AcessoUsuarioFilialMapper mapper = session.getMapper(AcessoUsuarioFilialMapper.class);
		List<AcessoUsuarioFilial> acessoUsuarioFilials = mapper.selectByExample(new AcessoUsuarioFilialExample());
		session.commit();
		session.close();
		return acessoUsuarioFilials;
	}

}
