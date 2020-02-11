package com.depa.basket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class BasketController {
    @Autowired
    private BasketRepository basketRepository;

    @GetMapping("/baskets")
    public List<Basket> getBaskets() {
        return basketRepository.findAll();
    }

    @PostMapping("/basket")
    public Basket createBasket() {
        return basketRepository.save(new Basket(Collections.singletonList(new Product()), 1));
    }

    @PutMapping("/basket/{id}")
    public Basket updateBasket(@PathVariable String id) {
        Basket basket = basketRepository.findById(id).get();
        basket.setUserId(99);
        return basketRepository.save(basket);
    }
}
