package com.przper.shopping_basket.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import Model.Basket;
import Model.Item;
import Service.BasketDao;

@SpringBootTest
public class BasketDaoTest {
	BasketDao basketDao;
	
	@Test()
	void shouldNotAddExistingItem() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Bread", 12.34d));
		
		Basket basket = new Basket(new TreeMap<>());
		basketDao.addItem(basket, items.get(0), 1);
		basketDao.addItem(basket, items.get(0), 5);
		
	}
	
}
