package ru.gb.oseminar;

public class Main {
    public static void main(String[] args) {
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat("HotDrinkAutomat", 100, 100);

        HotDrink tea = new HotDrink("tea", 200, 100);
        HotDrink coffee = new HotDrink("coffee", 300, 100);
        System.out.println(hotDrinkAutomat);
        System.out.println(tea);
        System.out.println(coffee);
        
    }
    
}
