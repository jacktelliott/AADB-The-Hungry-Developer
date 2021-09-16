package com.jackelliott.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish ("Bean and coconut cake", "Moist cake made with bean and fresh coconut", 699),
                new Dish ("Cocoa and honey pudding", "A rich suet pudding made with cocoa and acacia honey", 875),
                new Dish ("Pear and chocolate pancake", "Fluffy pancake filled with dried pears and plain chocolate", 400),
                new Dish ("Blackcurrant and durian cheesecake", "A rich cheesecake layered with fresh blackcurrant and durian", 600),
                new Dish ("Pumpkin seed and coriander buns", "Moist buns made with pumpkin seeds and dried coriander", 900),
                new Dish ("Cardamom and strawberry cupcakes", "Fluffy cupcakes made with black cardamom and fresh strawberries", 1000),
                new Dish ("Milk chocolate and vanilla mousse", "A creamy mousse made with milk chocolate and vanilla", 499),
                new Dish ("Oatbran and apple buns", "Moist buns made with oatbran and green apple", 799),
                new Dish ("Orange and bacon cupcakes", "Crumbly cupcakes made with seville orange and streaky bacon", 1050),
                new Dish ("Rice and blueberry crepes", "Crispy crepes filled with wild rice and fresh blueberry", 849),
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsList.setAdapter(dishesAdapter);
    }
}