package com.demo.helloSpring;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StockRepo extends JpaRepository<Stock, Integer> {

	public Stock findBycompanyName(String companyName);
}
