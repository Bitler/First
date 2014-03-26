package org.bitler.entity;

public class Article {
	
	private int articleId;
	
	private String articleName;
	
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
