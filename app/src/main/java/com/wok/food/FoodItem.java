package com.wok.food;
import java.io.Serializable;
/**
 * Created by b on 2/15/2016.
 */
public class FoodItem implements Serializable{
    Food food;
    double quantity;
    public FoodItem(Food f, double quant)
    {
        food=f;
        quantity=quant;
    }
}
