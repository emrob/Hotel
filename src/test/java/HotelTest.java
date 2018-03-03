import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom1;
    Bedroom bedroom2;
//    Bedroom bedroom3;
    ArrayList<Bedroom> availableBedrooms;
    ArrayList<DiningRoom> diningRooms;
    DiningRoom diningRoomBuffet;
    DiningRoom fineDiningRoom;
//    ArrayList<ConferenceRoom> conferenceRoom;
//


    @Before
    public void setup(){
        guest = new Guest("Rosemary");
        bedroom1 = new Bedroom(101, 2, 45, 1, "double");
        bedroom2 = new Bedroom(105, 1, 30, 1, "single");
        availableBedrooms = new ArrayList<>();
        availableBedrooms.add(bedroom1);
        availableBedrooms.add(bedroom2);
        diningRoomBuffet = new DiningRoom(1, 100);
        fineDiningRoom = new DiningRoom(10, 40);
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoomBuffet);
        diningRooms.add(fineDiningRoom);

        hotel = new Hotel(guest, bedroom1,availableBedrooms,fineDiningRoom, diningRooms);


    }

    @Test
    public void checkAvailableRooms(){
        assertEquals(2, hotel.availableBedRooms());
    }

    @Test
    public void testCheckIn(){
        assertEquals(1, hotel.checkin());

    }

    @Test
    public void testCheckNameofGuestInRoom(){
        assertEquals("Rosemary", hotel.findGuestNameinRoom());
    }

    @Test
    public void testCheckNumofNights(){
        assertEquals(3, hotel.checkInForNumberOfNIghts());
    }

}
