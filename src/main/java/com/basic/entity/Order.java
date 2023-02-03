package com.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private String orderId;
	
	@Column(name = "name")
	    private String name;
	
	@Column(name = "qty")
	    private int qty;
	
	@Column(name = "price")
	    private double price;
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Order(String orderId, String name, int qty, double price) {
			super();
			this.orderId = orderId;
			this.name = name;
			this.qty = qty;
			this.price = price;
		}
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
		}
	    
	    
}
