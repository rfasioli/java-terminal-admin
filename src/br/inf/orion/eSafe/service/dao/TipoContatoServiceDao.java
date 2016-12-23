package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.TipoContato;
import br.inf.orion.eSafe.model.example.TipoContatoExample;
import br.inf.orion.eSafe.model.mapper.TipoContatoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class TipoContatoServiceDao {

	public static void save(TipoContato tipoContato) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		mapper.insert(tipoContato);
		session.commit();
		session.close();
	}

	public static void update(TipoContato tipoContato) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		mapper.updateByPrimaryKey(tipoContato);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static TipoContato getByType(int type) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		TipoContato tipoContato = mapper.selectByPrimaryKey(type);
		session.commit();
		session.close();
		return tipoContato;
	}

	public static List<TipoContato> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoContatoMapper mapper = session.getMapper(TipoContatoMapper.class);
		List<TipoContato> tipoContatos = mapper.selectByExample(new TipoContatoExample());
		session.commit();
		session.close();
		return tipoContatos;
	}
	
}
