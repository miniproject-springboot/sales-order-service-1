package com.otj.salesorderservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.otj.salesorderservice.model.CustomerSOS;
import com.otj.salesorderservice.model.Item;
import com.otj.salesorderservice.model.OrderLineItem;
import com.otj.salesorderservice.model.SalesOrder;
import com.otj.salesorderservice.repository.CustomerSOSRepo;
import com.otj.salesorderservice.repository.OrderLineItemRepo;
import com.otj.salesorderservice.repository.SalesOrderRepo;

@RestController
public class SalesOrderController {
	
	@Autowired
	private CustomerSOSRepo customersosrepo;
	
//	@Autowired
//	private OrderLineItemRepo orderLineItemRepo;
	
	@Autowired
	private SalesOrderRepo salesOrderRepo;

	@SuppressWarnings("unchecked")
	@PostMapping("service3/orders")
	public void createOrder(@RequestBody SalesOrder salesOrder) {
		
		long total_price=0;
		Optional<CustomerSOS> customer = customersosrepo.findById(salesOrder.getCust_id());
		//verify customer
		if(customer.isPresent()) {
			
			List<OrderLineItem> item=salesOrder.getOrderLineItem();
			for(int i=0;i<item.size();i++) {
				
			Map<String,String> urivariable = new HashMap<>();
			
			urivariable.put("name", item.get(i).getItem_name());
			List<Item> listitem = (List<Item>) new RestTemplate().getForEntity("http://localhsot:8001/service2/items/{itemname}",Item.class,urivariable);
			total_price =item.get(i).getItem_quantity() * total_price + listitem.get(i).getPrice();
			
			}
			salesOrder.setTotal_price(total_price);
			salesOrderRepo.save(salesOrder);
			
			
			
			
		}
		//validate items by calling item service
		//create order
		
		
	}
}
