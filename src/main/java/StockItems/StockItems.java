package StockItems;

import Behaviours.ISell;

abstract public class StockItems implements ISell {
    protected double purchasePrice;
    protected double sellPrice;

    public StockItems(double purchasePrice, double sellPrice) {
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
