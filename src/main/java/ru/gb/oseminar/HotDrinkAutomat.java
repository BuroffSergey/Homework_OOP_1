package ru.gb.oseminar;

public class HotDrinkAutomat implements VendingMachine {
    
    public HotDrinkAutomat(String name, int volume, int temperature) {
        super();
    }

    @Override
    public String toString() {
        return "HotDrinkAutomat []";
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) throws IllegalStateException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }

}