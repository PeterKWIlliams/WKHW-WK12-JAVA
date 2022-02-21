package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    public Shop(ArrayList<ISell> stock){
        this.stock = stock;
    }

    public ArrayList<ISell> getStock(){
        return this.stock;
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

}
