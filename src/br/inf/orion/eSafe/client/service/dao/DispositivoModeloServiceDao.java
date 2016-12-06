package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.DispositivoModeloKey;
import br.inf.orion.eSafe.client.model.example.DispositivoModeloExample;
import br.inf.orion.eSafe.client.model.mapper.DispositivoModeloMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class DispositivoModeloServiceDao {
	public static void save(int idCliente, DispositivoModeloKey dispositivoModelo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoModeloMapper mapper = session.getMapper(DispositivoModeloMapper.class);
		mapper.insert(dispositivoModelo);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, DispositivoModeloKey id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoModeloMapper mapper = session.getMapper(DispositivoModeloMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<DispositivoModeloKey> getByModelo(int idCliente, int idModelo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoModeloMapper mapper = session.getMapper(DispositivoModeloMapper.class);
		DispositivoModeloExample filter = new DispositivoModeloExample();
		filter.createCriteria().andIdModeloEqualTo(idModelo);
		List<DispositivoModeloKey> dispositivoModelos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return dispositivoModelos;
	}

	public static List<DispositivoModeloKey> getByDispositivo(int idCliente, int idDispositivo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoModeloMapper mapper = session.getMapper(DispositivoModeloMapper.class);
		DispositivoModeloExample filter = new DispositivoModeloExample();
		filter.createCriteria().andIdDispositivoEqualTo(idDispositivo);
		List<DispositivoModeloKey> dispositivoModelos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return dispositivoModelos;
	}

	public static List<DispositivoModeloKey> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		DispositivoModeloMapper mapper = session.getMapper(DispositivoModeloMapper.class);
		List<DispositivoModeloKey> dispositivoModelos = mapper.selectByExample(new DispositivoModeloExample());
		session.commit();
		session.close();
		return dispositivoModelos;
	}

}
