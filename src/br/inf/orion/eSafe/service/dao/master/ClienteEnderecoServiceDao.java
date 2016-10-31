package br.inf.orion.eSafe.service.dao.master;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.mapper.master.ClienteEnderecoMapper;
import br.inf.orion.eSafe.model.master.ClienteEndereco;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class ClienteEnderecoServiceDao {
	public static void save(ClienteEndereco ClienteEndereco) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		mapper.insert(ClienteEndereco);
		session.commit();
		session.close();
	}

	public static void update(ClienteEndereco ClienteEndereco) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		mapper.update(ClienteEndereco);
		session.commit();
		session.close();
	}

	public static void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}

	public static ClienteEndereco getByUnique(int idCliente, int idSequencia) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		ClienteEndereco ClienteEndereco = mapper.getUnique(idCliente, idSequencia);
		session.commit();
		session.close();
		return ClienteEndereco;
	}

	public static List<ClienteEndereco> getByIdCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		List<ClienteEndereco> ClienteEnderecos = mapper.getByIdCliente(id);
		session.commit();
		session.close();
		return ClienteEnderecos;
	}

	public static List<ClienteEndereco> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		List<ClienteEndereco> ClienteEnderecos = mapper.getAll();
		session.commit();
		session.close();
		return ClienteEnderecos;
	}

}
