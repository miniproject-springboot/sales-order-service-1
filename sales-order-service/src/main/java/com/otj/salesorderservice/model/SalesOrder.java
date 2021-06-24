package com.otj.salesorderservice.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="sales_order")
public class SalesOrder {
	
	@Id
	@GeneratedValue
	private long id;
	private Date order_date;
	private long cust_id;
	private String order_desc;
	private long total_price;
	
	private List<OrderLineItem> orderLineItem;
	
	public SalesOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesOrder(long id, Date order_date, long cust_id, String order_desc, long total_price) {
		super();
		this.id = id;
		this.order_date = order_date;
		this.cust_id = cust_id;
		this.order_desc = order_desc;
		this.total_price = total_price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getOrder_desc() {
		return order_desc;
	}
	public void setOrder_desc(String order_desc) {
		this.order_desc = order_desc;
	}
	public long getTotal_price() {
		return total_price;
	}
	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}
	public List<OrderLineItem> getOrderLineItem() {
		return orderLineItem;
	}
	public void setOrderLineItem(List<OrderLineItem> orderLineItem) {
		this.orderLineItem = orderLineItem;
	}
	
	
	
	
	

}
