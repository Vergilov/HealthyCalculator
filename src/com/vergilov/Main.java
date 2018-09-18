package com.vergilov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Person maciek = new Person(170, 80, "Mesomorph", "Women", 28);
        Product piers = new Product("Piers z kuraka", 12.0, 28.0, 7.0);
        Product sandwich = new Product("Kanapeczkia", 11.0, 8.0, 4.0);
        Product hamburger = new Product("Hamburger", 22.0, 28.0, 19.0);
        Product cola = new Product("Cola Zero", 0.5, 0.0, 0.0);
        Product bread = new Product("Pieczywo Biale", 12.0, 18.0, 4.0);

        productList.add(sandwich);
        productList.add(hamburger);
        productList.add(cola);
        productList.add(bread);
        productList.add(piers);

        HealthyCalculator calculator = new Diet(maciek, "Moderate", productList);


        ((Diet) calculator).meal();


    }
}
