import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void setup(){
      guest1 = new Guest("Mark");
    }

    @Test

    public void checkGetName(){
    assertEquals("Mark", guest1.getName());
    }

    @Test
    public void checkGetBill(){
        assertEquals(0, guest1.getBill(),0.01);
    }

    @Test
    public void checkGetRoomCharge(){
        guest1.roomCharge(30);
        assertEquals(30, guest1.getBill(),0.01);
    }

    @Test
    public void checkGetRefund(){
        guest1.roomCharge(60);
        guest1.refund(30);
        assertEquals(30, guest1.getBill(),0.01);
    }


}
