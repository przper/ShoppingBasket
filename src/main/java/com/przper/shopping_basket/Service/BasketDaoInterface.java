package com.przper.shopping_basket.Service;

import java.util.List;

import com.przper.shopping_basket.Model.Basket;
import com.przper.shopping_basket.Model.Item;

public interface BasketDaoInterface {
	void addItem(Basket basket, Item item, int quantity);
	void removeItem(Basket basket, Item item);
	void updateQuantity(Basket basket, Item item, int newQuantity);
	double getTotalValue(Basket basket);
	List<Item> getAvailableItems();
	
}
