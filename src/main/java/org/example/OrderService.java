package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class OrderService {
public OrderService(){
    System.out.println("Order Service created");
}

    void placeOrder(){
        System.out.println("order placed");
    }
}
