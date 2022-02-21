import Behaviours.ISell;
import Shop.Shop;
import StockItems.GuitarStrings;
import StockItems.Instrument.Flute;
import StockItems.Instrument.Guitar;
import StockItems.Instrument.InstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell guitar;
    ISell flute;
    ISell guitarStrings;
    ArrayList<ISell> stock;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(10,20);
        flute = new Flute("Plastic", InstrumentFamily.WOODWIND, "Plastic Flute", 300, 400, 8);
        guitar = new Guitar("Wood", InstrumentFamily.STRINGS,"Acoustics",500,600,6);
        stock = new ArrayList<ISell>();
        Collections.addAll(stock, flute, guitar, guitarStrings);
        shop = new Shop(stock);

    }


    @Test
    public void shopHasStock(){
        assertEquals(3,shop.getStock().size());
    }

    @Test
    public void canRemoveItem(){
        shop.removeFromStock(guitarStrings);
        assertEquals(2,shop.getStock().size());
    }


    @Test
    public void canAddItem(){
        shop.addToStock(guitarStrings);
        assertEquals(4,shop.getStock().size());
    }


}
