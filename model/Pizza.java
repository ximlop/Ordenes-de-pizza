package model;

import enums.Base;
import enums.Salsa;
import enums.Toppings;

public class Pizza {

    private Base base;
    private Toppings[] toppings;
    private Salsa salsa;
    private Toppings topping;

    public Pizza (Base base, Toppings topping, Salsa salsa){
        this.base = base;
        this.topping = topping;
        this.salsa = salsa;
    }

    public Pizza (Base base, Toppings[] toppings, Salsa salsa){
        this.base = base;
        this.toppings = toppings;
        this.salsa = salsa;
    }

    

    
}