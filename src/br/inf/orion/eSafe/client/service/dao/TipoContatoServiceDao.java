package br.inf.orion.eSafe.client.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.client.model.TipoContato;
import br.inf.orion.eSafe.client.model.example.TipoContatoExample;
import br.inf.orion.eSafe.client.model.mapper.TipoContatoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class TipoContatoServiceDao {
	public static void save(int idCliente, TipoContato tipoContato) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		mapper.insert(tipoContato);
		session.commit();
		session.close();
	}

	public static void update(int idCliente, TipoContato tipoContato) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		mapper.updateByPrimaryKey(tipoContato);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static TipoContato getById(int idCliente, int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		TipoContato tipoContato = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return tipoContato;
	}

	public static List<TipoContato> getAll(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory(idCliente).openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		List<TipoContato> tipoContatos = mapper.selectByExample(new TipoContatoExample());
		session.commit();
		session.close();
		return tipoContatos;
	}

}
