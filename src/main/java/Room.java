import java.util.ArrayList;

public abstract class Room {

    public int roomNumber;
    public int capacity;
    public ArrayList<Guest> guests;

    public Room (int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
}
