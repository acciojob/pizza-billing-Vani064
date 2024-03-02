package com.driver;

public class Pizza {

    private int price =0;
    private Boolean isVeg;
    private String bill ="";

    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean extraTakeway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {this.price = 300;
            this.bill += "Base Price Of The Pizza: 300 \n";
        }else{
            this.price = 400;
            this.bill += "Base Price Of The Pizza: 400 \n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.extraCheese)
            return;

        this.price += 80;
        this.extraCheese = true;
        this.bill += "Extra Cheese Added: 80 \n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.extraToppings)
            return;

        if(this.isVeg)
        {
            this.price += 70;
            this.bill += "Extra Toppings Added: 70 \n";
        }
        else {
            this.price += 120;
            this.bill += "Extra Toppings Added: 120 \n";
        }
        this.extraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(this.extraTakeway)
            return;
        this.price += 20;
        this.bill += "Paperbag Added: 20 \n";
        this.extraTakeway = true;
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price;
        return this.bill;
    }
}
