package com.depa.basket;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasketRepository extends MongoRepository<Basket, String> {
}
