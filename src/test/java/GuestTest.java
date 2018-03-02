import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setup(){
      guest = new Guest("Mark");
    }

    @Test

    public void getName(){
    assertEquals("Mark", guest.getName());
    }
}
