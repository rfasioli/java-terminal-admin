package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Filial;
import br.inf.orion.eSafe.client.model.example.FilialExample;
import br.inf.orion.eSafe.client.model.mapper.FilialMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class FilialServiceDao {
	public static void save(int idCliente, Filial filial) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FilialMapper mapper = session.getMapper(FilialMapper.class);
		mapper.insert(filial);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Filial filial) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FilialMapper mapper = session.getMapper(FilialMapper.class);
		mapper.updateByPrimaryKey(filial);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FilialMapper mapper = session.getMapper(FilialMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Filial getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FilialMapper mapper = session.getMapper(FilialMapper.class);
		Filial filial = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return filial;
	}

	public static List<Filial> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		FilialMapper mapper = session.getMapper(FilialMapper.class);
		List<Filial> filials = mapper.selectByExample(new FilialExample());
		session.commit();
		session.close();
		return filials;
	}

}
