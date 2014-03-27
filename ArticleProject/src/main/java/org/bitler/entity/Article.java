package org.bitler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Article")
public class Article {
	
	@Id
	@Column(name="article_id")	
	@GeneratedValue(strategy =  GenerationType.TABLE)
	@SequenceGenerator(name = "ROL_SEQ")
	private Integer articleId;
	
	@Column(name="article_name")
	private String articleName;
	
	@Column(name="article_barcode")
	private int articleBarcode;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public int getArticleBarcode() {
		return articleBarcode;
	}

	public void setArticleBarcode(int articleBarcode) {
		this.articleBarcode = articleBarcode;
	}

	@Override
	public String toString() {
		return "articleName="
				+ articleName + ", articleBarcode=" + articleBarcode;
	}
		
}
