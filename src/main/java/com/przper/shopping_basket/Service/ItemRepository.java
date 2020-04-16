package com.przper.shopping_basket.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.przper.shopping_basket.Model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
