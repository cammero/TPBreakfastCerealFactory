package com.cameoEugeneJessy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by in0418gq on 10/5/2015.
 */
public class Cereal {
    private String name;
    HashMap<String, Double> ingredients;


public Cereal(String cerealName, HashMap<String, Double> IngredientsList){

    this.name = cerealName;
    this.ingredients = IngredientsList;

    }
    public String getName() {return name;

    }
    public static void cerealAdd(ArrayList allCereals) {
        HashMap <String, Double> RiceCrunchiesIngredients = new HashMap<>();
        RiceCrunchiesIngredients.put("Rice", 400.0);
        RiceCrunchiesIngredients.put("Sugar", 20.0);
        RiceCrunchiesIngredients.put("Salt",1.0);

        HashMap <String, Double> MorningFlakesIngredients = new HashMap<>();
        MorningFlakesIngredients.put("Corn", 350.0);
        MorningFlakesIngredients.put("Sugar", 40.0);
        MorningFlakesIngredients.put("Salt",1.0);

        HashMap <String, Double> TrianglzIngredients = new HashMap<>();
        TrianglzIngredients.put("Rice", 200.0);
        TrianglzIngredients.put("Sugar", 35.0);
        TrianglzIngredients.put("Salt", .50);
        TrianglzIngredients.put("Corn",200.0);
    }
}
