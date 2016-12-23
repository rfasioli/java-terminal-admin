package br.inf.orion.eSafe.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.SistemaClienteKey;
import br.inf.orion.eSafe.model.example.ClienteExample;
import br.inf.orion.eSafe.model.example.SistemaClienteExample;
import br.inf.orion.eSafe.model.mapper.ClienteMapper;
import br.inf.orion.eSafe.model.mapper.SistemaClienteMapper;
import br.inf.orion.eSafe.util.MyBatisUtil;

public class SistemaClienteServiceDao {
	public static void save(SistemaClienteKey sistemaCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		mapper.insert(sistemaCliente);
		session.commit();
		session.close();
	}

	public static void deleteByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		SistemaClienteExample filter = new SistemaClienteExample();
		filter.createCriteria().andIdClienteEqualTo(idCliente);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}

	public static void deleteBySistema(int idSistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		SistemaClienteExample filter = new SistemaClienteExample();
		filter.createCriteria().andIdSistemaEqualTo(idSistema);
		mapper.deleteByExample(filter);
		session.commit();
		session.close();
	}
	
	public static void delete(SistemaClienteKey sistemaCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		mapper.deleteByPrimaryKey(sistemaCliente);
		session.commit();
		session.close();
	}

	public static List<SistemaClienteKey> getAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		List<SistemaClienteKey> sistemaClientes = mapper.selectByExample(new SistemaClienteExample());
		session.commit();
		session.close();
		return sistemaClientes;
	}

	public static List<SistemaClienteKey> getByCliente(int idCliente) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		SistemaClienteExample filter = new SistemaClienteExample();
		filter.createCriteria().andIdClienteEqualTo(idCliente);
		List<SistemaClienteKey> sistemaClientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return sistemaClientes;
	}

	public static List<SistemaClienteKey> getBySistema(int idSistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		SistemaClienteExample filter = new SistemaClienteExample();
		filter.createCriteria().andIdSistemaEqualTo(idSistema);
		List<SistemaClienteKey> sistemaClientes = mapper.selectByExample(filter);
		session.commit();
		session.close();
		return sistemaClientes;
	}

	public static List<Cliente> getCliBySistema(int idSistema) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		SistemaClienteMapper mapper = session.getMapper(SistemaClienteMapper.class);
		SistemaClienteExample filter = new SistemaClienteExample();
		filter.createCriteria().andIdSistemaEqualTo(idSistema);
		List<SistemaClienteKey> sistemaClientes = mapper.selectByExample(filter);
		
		List<Integer> lstCliente = new ArrayList<Integer>();
		for (SistemaClienteKey sistemaCliente : sistemaClientes) {
			lstCliente.add(sistemaCliente.getIdCliente());
		}
		
		ClienteMapper mapperCliente = session.getMapper(ClienteMapper.class);
		ClienteExample filterCliente = new ClienteExample();
		filterCliente.createCriteria().andIdClienteIn(lstCliente);
		List<Cliente> clientes = mapperCliente.selectByExample(filterCliente);
		session.commit();
		session.close();
		return clientes;
	}
	
}
