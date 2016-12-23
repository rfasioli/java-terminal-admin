package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Usuario;
import br.inf.orion.eSafe.model.example.UsuarioExample;
import br.inf.orion.eSafe.model.mapper.UsuarioMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class UsuarioServiceDao {
	public static void save(Usuario usuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		mapper.insert(usuario);
		session.commit();
		session.close();
	}

	public static void update(Usuario usuario) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		mapper.updateByPrimaryKey(usuario);
		session.commit();
		session.close();
	}
	
	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		mapper.deleteByPrimaryKey(id);
		session.commit();
		session.close();
	}

	public static List<Usuario> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		List<Usuario> usuarios = mapper.selectByExample(new UsuarioExample());
		session.commit();
		session.close();
		return usuarios;
	}

	public static Usuario getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		Usuario usuario = mapper.selectByPrimaryKey(id);
		session.commit();
		session.close();
		return usuario;
	}

	public static Usuario getByLogin(String login) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		UsuarioExample filter = new UsuarioExample();
		filter.createCriteria().andDsLoginEqualTo(login);
		Usuario usuario = mapper.selectByExample(filter).iterator().next();
		session.commit();
		session.close();
		return usuario;
	}
	
}
