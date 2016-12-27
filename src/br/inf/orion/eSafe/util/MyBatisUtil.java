package br.inf.orion.eSafe.util;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import br.inf.orion.eSafe.service.dao.ClienteServiceDao;

public class MyBatisUtil {
	private static Map<Integer, SqlSessionFactory> sqlSessionClients;
	static {
		sqlSessionClients = new Hashtable<Integer, SqlSessionFactory>();
	}
	
	private static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}

	
	public static SqlSessionFactory getSqlSessionFactory(int idCliente){
		SqlSessionFactory session = sqlSessionClients.get(idCliente);
		if (session == null) {
			session = getSqlSession(idCliente);
			if (session != null) { 
				sqlSessionClients.put(idCliente, session);
			}
		}
		return session;
	}
	
	private static SqlSessionFactory getSqlSession(int idCliente)
	{
		SqlSessionFactory session = null;
		String resource = "mybatis-client-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			Properties properties = new Properties();
			properties.setProperty("username", "postgres");  //TODO - definir parametro
			properties.setProperty("password", "Orion@123"); //TODO - definir parametro
			properties.setProperty("url", ClienteServiceDao.getById(idCliente).getDsConexao());
			session = new SqlSessionFactoryBuilder().build(inputStream, properties);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
}
