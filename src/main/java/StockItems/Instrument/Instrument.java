package StockItems.Instrument;

import StockItems.StockItems;

abstract public class Instrument extends StockItems  {
    private String material;
    private InstrumentFamily instrumentFamily;
    private String instrumentType;


    public Instrument(String material, InstrumentFamily instrumentFamily,String instrumentType,double  purchasePrice,double sellPrice) {
        super(purchasePrice,sellPrice);
        this.material = material;
        this.instrumentFamily = instrumentFamily;
        this.instrumentType = instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
    public String getInstrumentType(){
        return this.instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public InstrumentFamily getInstrumentFamily() {
        return this.instrumentFamily;
    }


}
