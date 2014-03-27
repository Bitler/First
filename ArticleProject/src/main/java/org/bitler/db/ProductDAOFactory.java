package org.bitler.db;

import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProductDAOFactory {

	private static ProductDAOFactory instance = new ProductDAOFactory();
	
	/*@Autowired
	public static @Bean Connection getConnection(JdbcConnectionPool connectionPool){
		
		return instance.createConnection(connectionPool);
	}
	
	private Connection createConnection(JdbcConnectionPool connectionPool) {

		Connection connection = null;
		
		try {
			if(connectionPool!=null){		
			connection=connectionPool.getConnection();
			System.out.println(connection.toString());
		
			}else{
				System.out.println("NullPointerConnection");
			}	
		
		} catch (SQLException e) {

			System.out.println("ERROR: Unable to Connect to Database.");
			
		}
		return connection;
	}*/
	
}
