package com.company;

import com.company.enums.PizzaSize;
import com.company.interfaces.Deliverable;
import com.company.interfaces.Orderable;
import com.company.interfaces.Pricable;

public class Pizza implements Pricable {

    private String name;
    private int quantity;
    private int price;
    private PizzaSize pizzaSize;

    public Pizza(String name, int quantity, int price, PizzaSize pizzaSize) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.pizzaSize = pizzaSize;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    @Override
    public int calcDeliveryPrice() {
        if (pizzaSize == PizzaSize.LARGE || pizzaSize == PizzaSize.LARGE || quantity >2 )
            return 3;
        else
            return 7;
    }

    @Override
    public int calcOrderPrice() {
        return quantity * price;
    }
}
