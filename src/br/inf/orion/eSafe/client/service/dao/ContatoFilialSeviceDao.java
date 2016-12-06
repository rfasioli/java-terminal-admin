package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.ContatoFilial;
import br.inf.orion.eSafe.client.model.example.ContatoFilialExample;
import br.inf.orion.eSafe.client.model.mapper.ContatoFilialMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ContatoFilialSeviceDao {
	public static void save(int idCliente, ContatoFilial contatoFilial) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFilialMapper mapper = session.getMapper(ContatoFilialMapper.class);
		mapper.insert(contatoFilial);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, ContatoFilial contatoFilial) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFilialMapper mapper = session.getMapper(ContatoFilialMapper.class);
		mapper.updateByPrimaryKey(contatoFilial);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFilialMapper mapper = session.getMapper(ContatoFilialMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static ContatoFilial getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFilialMapper mapper = session.getMapper(ContatoFilialMapper.class);
		ContatoFilial contatoFilial = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return contatoFilial;
	}

	public static List<ContatoFilial> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		ContatoFilialMapper mapper = session.getMapper(ContatoFilialMapper.class);
		List<ContatoFilial> contatoFilials = mapper.selectByExample(new ContatoFilialExample());
		session.commit();
		session.close();
		return contatoFilials;
	}

}
