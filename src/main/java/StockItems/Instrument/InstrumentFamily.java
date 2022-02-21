package StockItems.Instrument;

public enum InstrumentFamily {
    STRINGS("String"),
    WOODWIND("Woodwind"),
    BRASS("Brass"),
    KEYBOARDS("Keyboards"),
    PERCUSSION("Percussion");

    private final String family;
    InstrumentFamily(String family){
        this.family = family;
    }

    public String getFamily(){
        return this.family;
    }
}
