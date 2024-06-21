package ru.gb.oseminar;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;


    Product getProduct(String name, int volume, int temperature) throws IllegalStateException;
}
