package com.depa.basket;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Basket {
    @Id
    private String id;

    @NonNull
    private List<Product> productList;
    @NonNull
    private int userId;
}
