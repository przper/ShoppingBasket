package com.przper.shopping_basket;

import java.util.HashMap;
import java.util.List;
import Model.Basket;
import Model.Item;
import Service.BasketDao;

public class test {
	public static void main(String[] args) {
		BasketDao basketDao = new BasketDao();
		List<Item> items = basketDao.getAvailableItems();
		Basket myBusket1 = new Basket(new HashMap<>());
		
		System.out.println(basketDao.getAvailableItems());
		
		basketDao.addItem(myBusket1, items.get(1), 2);
		basketDao.addItem(myBusket1, items.get(5), 3);
		basketDao.addItem(myBusket1, items.get(6), 3);

		System.out.println(myBusket1);
		
		basketDao.removeItem(myBusket1, items.get(1));
		
		System.out.println(myBusket1);
		
		basketDao.updateQuantity(myBusket1, items.get(1), 5);
		basketDao.updateQuantity(myBusket1, items.get(6), 1);
		
		System.out.println(myBusket1);
		
		System.out.println(basketDao.getTotalValue(myBusket1));
	}
}
