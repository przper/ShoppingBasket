package Service;

import java.util.List;

import Model.Basket;
import Model.Item;

public interface BasketDaoInterface {
	void addItem(Basket basket, Item item, int quantity);
	void removeItem(Basket basket, Item item);
	void updateQuantity(Basket basket, Item item, int newQuantity);
	double getTotalValue(Basket basket);
	List<Item> getAvailableItems();
	
}
