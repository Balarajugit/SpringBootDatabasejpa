package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer prodId;
	private String prodName;
	private Double prodFee;
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodName, Double prodFee) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodFee = prodFee;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdFee() {
		return prodFee;
	}
	public void setProdFee(Double prodFee) {
		this.prodFee = prodFee;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodFee=" + prodFee + "]";
	}
	

}
