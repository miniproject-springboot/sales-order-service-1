package com.otj.salesorderservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "order_line_item")
public class OrderLineItem {
	@Id
	@GeneratedValue
	private long id;
	private String item_name;
	private int item_quantity;
	private long order_id;
	
	public OrderLineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderLineItem(long id, String item_name, int item_quantity, long order_id) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.item_quantity = item_quantity;
		this.order_id = order_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	
	
	

}
