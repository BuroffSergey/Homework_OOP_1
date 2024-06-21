package ru.gb.oseminar;

public class HotDrink extends Product {
    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }
    int temperature;
    
}
