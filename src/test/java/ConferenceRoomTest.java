import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, 25, 100);
        guest1 = new Guest("Derek");

    }

    @Test
    public void checkHourlyRate() {
        assertEquals(100, conferenceRoom.getHourlyRate());
    }

    @Test
    public void addGuestReturnBill() {
        conferenceRoom.addGuest(guest1);
        guest1.roomCharge(200);
        assertEquals(200, guest1.getBill(),0.01);
    }
}
