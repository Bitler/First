package org.bitler.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.bitler.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ProductDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/*@Autowired
	private Connection connection;
	*/
	/*private Statement statement;
	
	private ResultSet rs;
	
	private int lastID=1;*/
	
/*	public void setConnection(Connection connection) {
		this.connection = connection;
	}
*/
	
	@SuppressWarnings("unchecked")	
	@Transactional
	public List<Product> getProduct() {
		
		List<Product> product = this.sessionFactory.getCurrentSession().createQuery("from Product").list();
		
		return product;
	}
/*		String query = "SELECT * FROM Product";
		
		Product product=null;
		ArrayList<Product> result=null;*/
		/*try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			result = new ArrayList<Product>();
			
			while (rs.next()){		
  			
				product = new Product();			
				product.setProductId(rs.getInt("Product_ID"));
				product.setProductName(rs.getString("Product_NAME"));
				product.setProductBarcode(rs.getInt("Product_BARCODE"));
				
				result.add(product);
			}	
			if (product!=null)
			lastID=product.getProductId()+1;
		}catch (SQLException e){
			System.out.println("Bad connection");			
		}*/
		
		/*return result;*/	
	
	@Transactional
	public boolean addProduct(Product product){
			this.sessionFactory.getCurrentSession().save(product);
		
		/*String query = "Insert into Product Values("
						+lastID+",'"
						+product.getArticleName()+"',"
						+product.getArticleBarcode()+")";
		
		try {
			statement=connection.createStatement();
			statement.executeUpdate(query);			
			
		} catch (SQLException e) {
			System.out.println("This Product already exist or Illegal barcode");		
		}*/
		
		return true;
	}
	
	
/*	public void close(){
		
		try {
			if(rs!=null)
			rs.close();
			if(statement!=null)
			statement.close();
			if(connection!=null)
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	
}