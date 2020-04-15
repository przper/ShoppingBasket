package com.przper.shopping_basket.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.przper.shopping_basket.Model.Basket;
import com.przper.shopping_basket.Model.Item;

public class BasketDao implements BasketDaoInterface {

	List<Item> availableItems;
	
	public BasketDao() {
		availableItems = new ArrayList<>();
		availableItems.add(new Item(1, "Apples", 2.09d));
		availableItems.add(new Item(2, "Cherries", 8.40d));
		availableItems.add(new Item(3, "Potatoas", 1.13d));
		availableItems.add(new Item(4, "Lettuces", 4.03d));
		availableItems.add(new Item(5, "Oranges", 3.97d));
		availableItems.add(new Item(6, "Avocados", 9.44d));
		availableItems.add(new Item(7, "Cucumbers", 3.17d));
	}
	
	@Override
	public void addItem(Basket basket, Item item, int quantity) {
		Map<Item,Integer> map = new HashMap<>();
		map = basket.getOrderedItems();
		map.put(item, quantity);
		basket.setOrderedItems(map);
	}

	@Override
	public void removeItem(Basket basket, Item item) {
		Iterator<Item> iterator = basket.getOrderedItems().keySet().iterator();
		while(iterator.hasNext()) {
			Item basketItem = iterator.next();
			if(basketItem == item) {
				iterator.remove();
			}
		}
	}

	@Override
	public void updateQuantity(Basket basket, Item item, int newQuantity) {
		Map<Item,Integer> map = new HashMap<>();
		map = basket.getOrderedItems();
		map.replace(item, newQuantity);
		basket.setOrderedItems(map);
	}

	@Override
	public double getTotalValue(Basket basket) {
		double total = 0d;
		for (Item item : basket.getOrderedItems().keySet()) {
			total += item.getPrice() * basket.getOrderedItems().get(item);
		}
		return total;
	}

	@Override
	public List<Item> getAvailableItems() {
		return availableItems;
	}

}
