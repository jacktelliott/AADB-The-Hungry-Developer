package com.jackelliott.thehungrydeveloper;

public class Dish {

    private String title;
    private String description;
    private int price; //in cents

    public Dish(String title, String description, int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
//        return "Dish{" +
//                "title='" + title + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                '}';
        return title;
    }
}
