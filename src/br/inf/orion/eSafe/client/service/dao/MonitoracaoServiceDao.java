package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.Monitoracao;
import br.inf.orion.eSafe.client.model.example.MonitoracaoExample;
import br.inf.orion.eSafe.client.model.mapper.MonitoracaoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class MonitoracaoServiceDao {
	public static void save(int idCliente, Monitoracao monitoracao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		MonitoracaoMapper mapper = session.getMapper(MonitoracaoMapper.class);
		mapper.insert(monitoracao);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, Monitoracao monitoracao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		MonitoracaoMapper mapper = session.getMapper(MonitoracaoMapper.class);
		mapper.updateByPrimaryKey(monitoracao);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		MonitoracaoMapper mapper = session.getMapper(MonitoracaoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static Monitoracao getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		MonitoracaoMapper mapper = session.getMapper(MonitoracaoMapper.class);
		Monitoracao monitoracao = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return monitoracao;
	}

	public static List<Monitoracao> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		MonitoracaoMapper mapper = session.getMapper(MonitoracaoMapper.class);
		List<Monitoracao> monitoracaos = mapper.selectByExample(new MonitoracaoExample());
		session.commit();
		session.close();
		return monitoracaos;
	}

}
