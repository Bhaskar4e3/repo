package com.demo.helloSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	@Autowired
	private StockClient stockClient;
	@GetMapping("/totalPrice/{companyName}/{quantity}")
	public ResponseEntity<Double> totalStockPrice(@PathVariable String companyName,@PathVariable int quantity){
	 Double totalstockPrice=0d;
		ResponseEntity<Double> totalPrice=stockClient.getPrice(companyName);
		
		if(totalPrice.getStatusCode().value()==200) {
		 totalstockPrice=totalPrice.getBody()*quantity;
		}
		return new ResponseEntity<>(totalstockPrice,HttpStatus.OK);
	}
	@GetMapping("/")
	public String say() {
		return"hiii";
	}

}
