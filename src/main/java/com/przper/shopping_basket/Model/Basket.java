package com.przper.shopping_basket.Model;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "baskets")
public class Basket {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer basketId;
	private @ElementCollection Map<Item, Integer> orderedItems;

	public Basket() {
		super();
	}

	public Basket(Map<Item, Integer> orderedItems) {
		super();
		this.orderedItems = orderedItems;
	}

	public Map<Item, Integer> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(Map<Item, Integer> orderedItems) {
		this.orderedItems = orderedItems;
	}

	@Override
	public String toString() {
		return "Basket [orderedItems=" + orderedItems + "]";
	}
}
