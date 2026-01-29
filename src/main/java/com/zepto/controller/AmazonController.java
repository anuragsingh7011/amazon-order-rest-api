package com.zepto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.entity.AmazonEntity;
import com.zepto.request.AmazonRequest;
import com.zepto.service.AmazonService;

@RestController
@RequestMapping("/amazon")
public class AmazonController {

	@Autowired
	AmazonService amazonService;
	
	@PostMapping("/save")
	public String saveOrder(@RequestBody AmazonRequest amazonRequest) {
			return	amazonService.insertOrder(amazonRequest);
	}
	
//	@GetMapping("/getOrder")
//	public Optional<AmazonEntity>  getOrderById(@RequestParam int id){	
//		return amazonService.fetchOrderById(id);
//	}
	
	@GetMapping("/getOrder/{id}")
	public Optional<AmazonEntity>  getOrderById(@PathVariable int id){	
		return amazonService.fetchOrderById(id);
	}
	
	@PutMapping("/updateOder/{id}")
	public Optional<AmazonEntity> updateOrder(@RequestBody AmazonRequest amazonRequest ,@PathVariable int id){
		return amazonService.updateOrder(amazonRequest,id);
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public String deleteOrder(@PathVariable int id) {
		return amazonService.deleteOrder(id);
	}
	
}
