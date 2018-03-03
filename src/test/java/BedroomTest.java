import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;

    @Before
    public void setup(){
        bedroom1 = new Bedroom(101, 1, 30, 2, "single");
        guest1 = new Guest("Mark");
        guest2 = new Guest("Darrell");

    }

    @Test
    public void testGetRoomNumber() {
        assertEquals(101, bedroom1.getRoomNumber());
    }

    @Test
    public void testGetRoomCapacity() {
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void testRoomType() {
        assertEquals("single", bedroom1.getType());
    }

    @Test
    public void testAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.numOfGuestsInRoom());
    }

    @Test
    public void testCheckOutGuest() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom1.removeGuest();
        assertEquals(1, bedroom1.numOfGuestsInRoom());
    }

    }


