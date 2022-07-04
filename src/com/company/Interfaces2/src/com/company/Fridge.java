package com.company;

public class Fridge extends Electronics {

    public Fridge(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
    if (getPrice()>=350) {
        return 0;
    } else
        return 25;
    }


}