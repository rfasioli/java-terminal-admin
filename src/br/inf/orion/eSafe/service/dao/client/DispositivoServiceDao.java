package br.inf.orion.eSafe.service.dao.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.client.Dispositivo;
import br.inf.orion.eSafe.model.client.example.TbDispositivoExample;
import br.inf.orion.eSafe.model.mapper.client.DispositivoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class DispositivoServiceDao {
	public static void save(int idCliente, Dispositivo dispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		mapper.insert(dispositivo);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Dispositivo dispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		mapper.updateByPrimaryKey(dispositivo);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Dispositivo getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		Dispositivo dispositivo = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return dispositivo;
	}

	public static List<Dispositivo> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoMapper mapper = session.getMapper(DispositivoMapper.class);
		List<Dispositivo> dispositivos = mapper.selectByExample(new TbDispositivoExample());
		session.commit();
		session.close();
		return dispositivos;
	}

}
