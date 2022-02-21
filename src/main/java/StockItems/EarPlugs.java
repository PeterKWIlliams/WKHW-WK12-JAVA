package StockItems;

import Behaviours.ISell;

public class EarPlugs extends StockItems implements ISell {
    public EarPlugs(double purchasePrice, double sellPrice) {
        super(purchasePrice, sellPrice);

    }

    @Override
    public double calculateMarkup() {
        return sellPrice -purchasePrice;
    }
}
