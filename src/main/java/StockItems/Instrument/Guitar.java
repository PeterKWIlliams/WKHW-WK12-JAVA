package StockItems.Instrument;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int numberOfStrings;


    public Guitar(String material, InstrumentFamily instrumentFamily, String instrumentType, double purchasePrice, double sellPrice,int numberOfStrings) {
        super(material, instrumentFamily,  instrumentType,purchasePrice,sellPrice);
        this.numberOfStrings =  numberOfStrings;
    }


    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    @Override
    public String play() {
        return "GuItAr SoUnDs";
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - purchasePrice;
    }
}
