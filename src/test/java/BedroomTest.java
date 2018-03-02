import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void setup(){
        bedroom = new Bedroom(101, 2, 30, 2);
    }

    @Test

    public void testGetRoomNumber() {
        assertEquals(101, bedroom.getRoomNumber());
    }
}
