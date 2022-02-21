package StockItems;

import Behaviours.ISell;

public class GuitarStrings extends StockItems implements ISell {
    public GuitarStrings(double purchasePrice, double sellPrice) {
        super(purchasePrice, sellPrice);
    }

    public double calculateMarkup() {
        return sellPrice -purchasePrice;
    }
}
