package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Sistema;
import br.inf.orion.eSafe.model.example.SistemaExample;
import br.inf.orion.eSafe.model.mapper.SistemaMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class SistemaServiceDao {
	public static void save(Sistema Sistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaMapper mapper = session.getMapper(SistemaMapper.class);
		mapper.insert(Sistema);
		session.commit();
		session.close();
	}

	public static void update(Sistema Sistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaMapper mapper = session.getMapper(SistemaMapper.class);
		mapper.updateByPrimaryKey(Sistema);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaMapper mapper = session.getMapper(SistemaMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Sistema getByType(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaMapper mapper = session.getMapper(SistemaMapper.class);
		Sistema Sistema = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return Sistema;
	}

	public static List<Sistema> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaMapper mapper = session.getMapper(SistemaMapper.class);
		List<Sistema> Sistemas = mapper.selectByExample(new SistemaExample());
		session.commit();
		session.close();
		return Sistemas;
	}

}
