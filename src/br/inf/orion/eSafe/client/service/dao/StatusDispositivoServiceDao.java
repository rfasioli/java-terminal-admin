package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.StatusDispositivo;
import br.inf.orion.eSafe.client.model.StatusDispositivoKey;
import br.inf.orion.eSafe.client.model.example.StatusDispositivoExample;
import br.inf.orion.eSafe.client.model.mapper.StatusDispositivoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class StatusDispositivoServiceDao {
	public static void save(int idCliente, StatusDispositivo statusDispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusDispositivoMapper mapper = session.getMapper(StatusDispositivoMapper.class);
		mapper.insert(statusDispositivo);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, StatusDispositivo statusDispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusDispositivoMapper mapper = session.getMapper(StatusDispositivoMapper.class);
		mapper.updateByPrimaryKey(statusDispositivo);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, StatusDispositivoKey id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusDispositivoMapper mapper = session.getMapper(StatusDispositivoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static StatusDispositivo getById(int idCliente, StatusDispositivoKey id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusDispositivoMapper mapper = session.getMapper(StatusDispositivoMapper.class);
		StatusDispositivo statusDispositivo = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return statusDispositivo;
	}

	public static List<StatusDispositivo> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusDispositivoMapper mapper = session.getMapper(StatusDispositivoMapper.class);
		List<StatusDispositivo> statusDispositivos = mapper.selectByExample(new StatusDispositivoExample());
		session.commit();
		session.close();
		return statusDispositivos;
	}

}
