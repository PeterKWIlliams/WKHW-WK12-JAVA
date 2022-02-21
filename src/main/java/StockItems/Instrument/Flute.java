package StockItems.Instrument;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Flute extends Instrument implements IPlay, ISell {
    private int numberOfHoles;
    public Flute(String material, InstrumentFamily instrumentFamily, String instrumentType, double purchasePrice, double sellPrice, int numberOfHoles) {
        super(material, instrumentFamily, instrumentType,purchasePrice,sellPrice);
        this.numberOfHoles = numberOfHoles;
    }


    public int getNumberOfHoles(){
        return this.numberOfHoles;
    }

    @Override
    public String play() {
        return "tu tu tu be be ";
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - purchasePrice;
    }
}
