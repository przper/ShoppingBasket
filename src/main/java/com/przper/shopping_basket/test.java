package com.przper.shopping_basket;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.przper.shopping_basket.Model.Basket;
import com.przper.shopping_basket.Model.Item;
import com.przper.shopping_basket.Service.BasketDao;
import com.przper.shopping_basket.Service.BasketRepository;
import com.przper.shopping_basket.Service.ItemRepository;

@Component
public class test implements CommandLineRunner {

	private @Autowired BasketRepository basketRepository;
	private @Autowired ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception {

		Item item1 = new Item(1, "Apples", 2.09d);
		Item item2 = new Item(2, "Cherries", 8.40d);
		Item item3 = new Item(3, "Potatoas", 1.13d);
		Item item4 = new Item(4, "Lettuces", 4.03d);
		Item item5 = new Item(5, "Oranges", 3.97d);
		Item item6 = new Item(6, "Avocados", 9.44d);
		Item item7 = new Item(7, "Cucumbers", 3.17d);

		List<Item> availableItems = new LinkedList<>();
		availableItems.add(item1);
		availableItems.add(item2);
		availableItems.add(item3);
		availableItems.add(item4);
		availableItems.add(item5);
		availableItems.add(item6);
		availableItems.add(item7);

		// availableItems.forEach(i -> itemRepository.save(i));

		Basket testBasket = new Basket();
		Map<Item, Integer> map = new HashMap<>();
		map.put(item1, 5);
		map.put(item3, 7);
		// basketRepository.save(testBasket);

		Optional<Basket> myBasket1 = basketRepository.findById(3);
		if (myBasket1 != null) {
			map.put(item1, 5);
			map.put(item3, 7);
			myBasket1.get().setOrderedItems(map);
			basketRepository.save(myBasket1.get());
		}

	}
}
