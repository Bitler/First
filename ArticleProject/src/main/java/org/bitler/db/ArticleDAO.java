package org.bitler.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.bitler.entity.Article;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ArticleDAO{
	
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
	public List<Article> getArticle() {
		
		List<Article> article = this.sessionFactory.getCurrentSession().createQuery("from Article").list();
		
		return article;
	}
/*		String query = "SELECT * FROM Article";
		
		Article article=null;
		ArrayList<Article> result=null;*/
		/*try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			result = new ArrayList<Article>();
			
			while (rs.next()){		
  			
				article = new Article();			
				article.setArticleId(rs.getInt("ARTICLE_ID"));
				article.setArticleName(rs.getString("ARTICLE_NAME"));
				article.setArticleBarcode(rs.getInt("ARTICLE_BARCODE"));
				
				result.add(article);
			}	
			if (article!=null)
			lastID=article.getArticleId()+1;
		}catch (SQLException e){
			System.out.println("Bad connection");			
		}*/
		
		/*return result;*/	
	
	@Transactional
	public boolean addArticle(Article article){
			this.sessionFactory.getCurrentSession().save(article);
		
		/*String query = "Insert into Article Values("
						+lastID+",'"
						+article.getArticleName()+"',"
						+article.getArticleBarcode()+")";
		
		try {
			statement=connection.createStatement();
			statement.executeUpdate(query);			
			
		} catch (SQLException e) {
			System.out.println("This Article already exist or Illegal barcode");		
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