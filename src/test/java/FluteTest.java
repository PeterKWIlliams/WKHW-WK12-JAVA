import StockItems.Instrument.Flute;
import StockItems.Instrument.InstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute ("Plastic", InstrumentFamily.WOODWIND, "Plastic Flute", 300, 400, 8);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Plastic", flute.getMaterial());
    }

    @Test
    public void hasFamily(){
        assertEquals("Woodwind", flute.getInstrumentFamily().getFamily());
    }

    @Test
    public void hasType(){
        assertEquals("Plastic Flute", flute.getInstrumentType());
    }

    @Test
    public void hasNumberOfHoles(){
        assertEquals(8, flute.getNumberOfHoles());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(300, flute.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(400, flute.getSellPrice(), 0.00);
    }

    @Test
    public void canGetMarkupPrice(){
        assertEquals(100,flute.calculateMarkup(),0.00);
    }

}
