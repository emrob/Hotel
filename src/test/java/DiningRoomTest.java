import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setup() {
        diningRoom = new DiningRoom(1, 70);
        guest1 = new Guest("Will");
        guest2 = new Guest("Sophie");
    }

    @Test
    public void testGetCapacity(){
        assertEquals(70, diningRoom.getCapacity());
    }

    @Test
    public void testAddGuests(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        assertEquals(2, diningRoom.numOfGuestsInRoom());


    }

}
