package com.company.interfaces;

public interface Pricable extends Deliverable, Orderable {

    default int calcPrice(){
    return calcOrderPrice() + calcDeliveryPrice();
    }

    static void doSmth(){

    }
}
