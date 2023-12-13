package com.demo.helloSpring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "STOCKS")
public class Stock {
	@Id
	@Column(name = "STOCK_ID")
	private int stockID;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@Column(name = "PRICE")
	private Double price;
	
	
	public Stock() {
		super();
	}
	public Stock(int stockID, String companyName, Double price) {
		super();
		this.stockID = stockID;
		this.companyName = companyName;
		this.price = price;
	}
	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", companyName=" + companyName + ", price=" + price + "]";
	}
	
	

}
