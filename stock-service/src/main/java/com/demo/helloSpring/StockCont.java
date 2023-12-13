package com.demo.helloSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StockCont {
	@Autowired
	private StockRepo stockRepo;
	@GetMapping("/price/{companyName}")
	public ResponseEntity<Double> getPrice(@PathVariable String companyName){
	Stock stk=stockRepo.findBycompanyName(companyName);
		
		return new ResponseEntity<>(stk.getPrice(),HttpStatus.OK);
		
	}

}
