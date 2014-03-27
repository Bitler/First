package org.bitler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@Column(name="product_id")	
	@GeneratedValue(strategy =  GenerationType.TABLE)
	@SequenceGenerator(name = "ROL_SEQ")
	private Integer productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_barcode")
	private int productBarcode;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(int productBarcode) {
		this.productBarcode = productBarcode;
	}

	@Override
	public String toString() {
		return "productName="
				+ productName + ", productBarcode=" + productBarcode;
	}
		
}
