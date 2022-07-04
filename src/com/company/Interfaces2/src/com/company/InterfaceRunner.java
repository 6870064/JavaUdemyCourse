package com.company;

import com.company.enums.PizzaSize;
import com.company.interfaces.Deliverable;
import com.company.interfaces.Pricable;

import java.awt.datatransfer.StringSelection;

public class InterfaceRunner {

    public static void main(String[] args) {
       Pricable pizza = new Pizza("Neapolitana", 1, 25, PizzaSize.LARGE);
       Pricable phone = new CellPhone("Apple", "iPhone 12 Pro Max", 1, 320);
       Pricable fridge = new Fridge("LG", "LG-F45", 1, 345);

       printDeliveryPrice(pizza);
       printDeliveryPrice(phone);
       printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Pricable del){
        System.out.println("Delivery price " +del.calcDeliveryPrice());
        System.out.println("Order price " +del.calcOrderPrice());
    }
}
