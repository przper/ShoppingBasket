package com.przper.shopping_basket.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
	private String name;
	private double price;
	
	public Item() {
		super();
	}
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Item(Integer itemId, String name, double price) {
		super();
		this.id = itemId;
		this.name = name;
		this.price = price;
	}

	public Integer getItemId() {
		return id;
	}
	public void setItemId(Integer itemId) {
		this.id = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
