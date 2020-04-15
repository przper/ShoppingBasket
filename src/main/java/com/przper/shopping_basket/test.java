package com.przper.shopping_basket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.przper.shopping_basket.Model.Basket;
import com.przper.shopping_basket.Model.Item;
import com.przper.shopping_basket.Service.BasketDao;
import com.przper.shopping_basket.Service.BasketRepository;

@Component
public class test implements CommandLineRunner {
	
	@Autowired
	private BasketRepository basketRepository;

	public static void main(String[] args) {

		BasketDao basketDao = new BasketDao();
		List<Item> items = basketDao.getAvailableItems();
		Basket myBasket1 = new Basket(new HashMap<>());

		// System.out.println(basketDao.getAvailableItems());

		//basketDao.addItem(myBasket1, items.get(1), 2);
		//basketDao.addItem(myBasket1, items.get(5), 3);
		//basketDao.addItem(myBasket1, items.get(6), 3);

		// basketRepo.save(myBasket1);

		// System.out.println(myBusket1);
		// basketDao.removeItem(myBusket1, items.get(1));
		// System.out.println(myBusket1);

		// basketDao.updateQuantity(myBusket1, items.get(1), 5);
		// basketDao.updateQuantity(myBusket1, items.get(6), 1);
		// System.out.println(myBusket1);
		// System.out.println(basketDao.getTotalValue(myBusket1));

	}

	@Override
	public void run(String... args) throws Exception {
		BasketDao basketDao = new BasketDao();
		List<Item> items = basketDao.getAvailableItems();
		Basket myBasket1 = new Basket(new HashMap<>());
		//basketDao.addItem(myBasket1, items.get(1), 2);
		//basketDao.addItem(myBasket1, items.get(5), 3);
		//basketDao.addItem(myBasket1, items.get(6), 3);
		Map<Item,Integer> map = new HashMap<>();
		Item item1 = new Item("Test",8);
		map.put(item1, 3);
		myBasket1.setOrderedItems(map);
		Basket savedBasket = basketRepository.save(myBasket1);
		
		//!!! wywala błąd bo najpierw trzeba zapisać jakiś item!
	}
}
