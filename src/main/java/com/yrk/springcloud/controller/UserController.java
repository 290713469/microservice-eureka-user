/**
 * 
 */
package com.yrk.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author runkaiyang
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("findOrdersByUser/{id}")
	public String findOrdersByUser(@PathVariable String id) {
		int oid = 23;
		return this.restTemplate.getForObject("http://microservice-eureka-order/order/" + oid, String.class);
	}
	
}
