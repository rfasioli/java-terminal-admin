package br.inf.orion.eSafe.service.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.ClienteEndereco;
import br.inf.orion.eSafe.model.ClienteEnderecoKey;
import br.inf.orion.eSafe.model.example.ClienteEnderecoExample;
import br.inf.orion.eSafe.model.mapper.ClienteEnderecoMapper;
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
		mapper.updateByPrimaryKey(ClienteEndereco);
		session.commit();
		session.close();
	}

	public static void delete(int idCliente, int idSequencia) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		ClienteEnderecoKey key = new ClienteEnderecoKey();
		key.setIdCliente(idCliente);
		key.setIdSequencia(idSequencia);
		mapper.deleteByPrimaryKey(key);
		session.commit();
		session.close();
	}

	public static ClienteEndereco getByUnique(int idCliente, int idSequencia) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		ClienteEnderecoKey key = new ClienteEnderecoKey();
		key.setIdCliente(idCliente);
		key.setIdSequencia(idSequencia);
		ClienteEndereco ClienteEndereco = mapper.selectByPrimaryKey(key);
		session.commit();
		session.close();
		return ClienteEndereco;
	}

	public static List<ClienteEndereco> getByIdCliente(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		ClienteEnderecoExample filter = new ClienteEnderecoExample();
		filter.createCriteria().andIdClienteEqualTo(id);
		List<ClienteEndereco> ClienteEnderecos = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return ClienteEnderecos;
	}

	public static List<ClienteEndereco> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteEnderecoMapper mapper = session.getMapper(ClienteEnderecoMapper.class);
		List<ClienteEndereco> ClienteEnderecos = mapper.selectByExample(new ClienteEnderecoExample());
		session.commit();
		session.close();
		return ClienteEnderecos;
	}

}
