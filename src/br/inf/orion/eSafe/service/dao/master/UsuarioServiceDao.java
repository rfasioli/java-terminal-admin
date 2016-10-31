package br.inf.orion.eSafe.service.dao.master;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.mapper.master.UsuarioMapper;
import br.inf.orion.eSafe.model.master.Usuario;
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
		mapper.update(usuario);
		session.commit();
		session.close();
	}
	
	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		mapper.deleteById(id);
		session.commit();
		session.close();
	}

	public static List<Usuario> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		List<Usuario> usuarios = mapper.getAll();
		session.commit();
		session.close();
		return usuarios;
	}

	public static Usuario getById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		Usuario usuario = mapper.getById(id);
		session.commit();
		session.close();
		return usuario;
	}

	public static Usuario getByLogin(String login) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		UsuarioMapper mapper = session.getMapper(UsuarioMapper.class);
		Usuario usuario = mapper.getByLogin(login);
		session.commit();
		session.close();
		return usuario;
	}
	
}
