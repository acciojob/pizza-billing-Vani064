package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean extraTakeway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {this.price += 300;
        }else{
            this.price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese)
            return;

        price += 80;
        extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings)
            return;

        if(isVeg)
        {
            price += 70;
        }
        else {
            price += 120;
        }
        extraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(extraTakeway)
            return;
        price += 20;
        extraTakeway = true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill = "Base Price Of The Pizza: 300\n";
        }else{
            bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheese){
            bill = bill + "Extra Cheese Added: 80\n";
        }

        if(extraToppings){
            if(isVeg){
                bill = bill + "Extra Toppings Added: 70\n";
            }else{
                bill = bill + "Extra Toppings Added: 120\n";
            }
        }

        if(extraTakeway){
            bill = bill + "Paperbag Added: 20\n";
        }

        String totalPrice = Integer.toString(price);

        bill = bill + "Total Price: " + totalPrice + "\n";
        return this.bill;
    }
}
