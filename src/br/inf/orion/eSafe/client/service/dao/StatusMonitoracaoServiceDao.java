package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.StatusMonitoracao;
import br.inf.orion.eSafe.client.model.StatusMonitoracaoKey;
import br.inf.orion.eSafe.client.model.example.StatusMonitoracaoExample;
import br.inf.orion.eSafe.client.model.mapper.StatusMonitoracaoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class StatusMonitoracaoServiceDao {
	public static void save(int idCliente, StatusMonitoracao statusMonitoracao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusMonitoracaoMapper mapper = session.getMapper(StatusMonitoracaoMapper.class);
		mapper.insert(statusMonitoracao);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, StatusMonitoracao statusMonitoracao) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusMonitoracaoMapper mapper = session.getMapper(StatusMonitoracaoMapper.class);
		mapper.updateByPrimaryKey(statusMonitoracao);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, StatusMonitoracaoKey id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusMonitoracaoMapper mapper = session.getMapper(StatusMonitoracaoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static StatusMonitoracao getById(int idCliente, StatusMonitoracaoKey id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusMonitoracaoMapper mapper = session.getMapper(StatusMonitoracaoMapper.class);
		StatusMonitoracao statusMonitoracao = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return statusMonitoracao;
	}

	public static List<StatusMonitoracao> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		StatusMonitoracaoMapper mapper = session.getMapper(StatusMonitoracaoMapper.class);
		List<StatusMonitoracao> statusMonitoracaos = mapper.selectByExample(new StatusMonitoracaoExample());
		session.commit();
		session.close();
		return statusMonitoracaos;
	}

}
