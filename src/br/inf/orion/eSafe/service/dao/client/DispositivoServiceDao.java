package br.inf.orion.eSafe.service.dao.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.client.bkp.Dispositivo;
import br.inf.orion.eSafe.model.mapper.client.bkp.DispositivoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class DispositivoServiceDao {
	public static void save(Dispositivo dispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		mapper.insert(dispositivo);
		session.commit();
		session.close();
	}

	public static void update(Dispositivo dispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		mapper.update(dispositivo);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static Dispositivo getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		Dispositivo dispositivo = mapper.getById(id);
		session.commit();
		session.close();
		return dispositivo;
	}

	public static List<Dispositivo> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		List<Dispositivo> clienteContatos = mapper.getAll();
		session.commit();
		session.close();
		return clienteContatos;
	}

}
