package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.TipoEndereco;
import br.inf.orion.eSafe.model.mapper.TipoEnderecoMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class TipoEnderecoServiceDao {
	public static void save(TipoEndereco tipoEndereco) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoEnderecoMapper mapper = session.getMapper(TipoEnderecoMapper.class);
		mapper.insert(tipoEndereco);
		session.commit();
		session.close();
	}

	public static void update(TipoEndereco tipoEndereco) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoEnderecoMapper mapper = session.getMapper(TipoEnderecoMapper.class);
		mapper.update(tipoEndereco);
		session.commit();
		session.close();
	}
	
	public static void delete(int tipo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoEnderecoMapper mapper = session.getMapper(TipoEnderecoMapper.class);
		mapper.delete(tipo);
		session.commit();
		session.close();
	}

	public static List<TipoEndereco> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoEnderecoMapper mapper = session.getMapper(TipoEnderecoMapper.class);
		List<TipoEndereco> tipoEnderecos = mapper.getAll();
		session.commit();
		session.close();
		return tipoEnderecos;
	}

	public static TipoEndereco getByType(int tipo) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TipoEnderecoMapper mapper = session.getMapper(TipoEnderecoMapper.class);
		TipoEndereco tipoEndereco = mapper.getByType(tipo);
		session.commit();
		session.close();
		return tipoEndereco;
	}

}
