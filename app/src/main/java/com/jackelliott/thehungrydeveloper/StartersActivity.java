package com.jackelliott.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        //Dish dishOne = new Dish("Mushroom and tofu maki", "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu", 999);

        Dish[] dishes = {
                new Dish("Mushroom and tofu maki", "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu", 999),
                new Dish("Egg and avocado uramaki", "Pasta in a sauce made from free range eggs and fresh avacado", 1199),
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

//        String[] dishNames = {
//                "Mushroom and tofu maki",
//                "Egg and avocado uramaki",
//                "Melon and lemon soup",
//                "Coconut and chocolate mousse",
//                "Spinach and cabbage wontons",
//                "Broccoli and cucumber soup",
//                "Chilli and aubergine dip",
//                "Chickpea and chilli gyoza",
//                "Sprout and pineapple soup",
//                "Egusi and borscht soup",
//                "Aubergine and egg sushi",
//                "Artichoke and mustard soup",
//                "Peppercorn and tamarind soup",
//                "Parsley and celeriac parcels",
//                "Pasta and broccoli soup",
//                "Potato and courgette soup",
//                "Chickpea and cabbage parcels",
//                "Coriander and peppercorn gyoza",
//                "Pear and chestnut soup",
//                "Pesto and garam masala parcels"
//        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}