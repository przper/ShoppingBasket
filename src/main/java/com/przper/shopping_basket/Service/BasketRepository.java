package com.przper.shopping_basket.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.przper.shopping_basket.Model.Basket;

public interface BasketRepository extends JpaRepository<Basket, Integer>{

}
