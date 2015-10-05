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
}
