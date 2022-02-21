import StockItems.Instrument.Guitar;
import StockItems.Instrument.InstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar("Wood", InstrumentFamily.STRINGS,"Acoustics",500,600,6);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6,guitar.getNumberOfStrings());
    }
}
