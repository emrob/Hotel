import java.util.ArrayList;

public abstract class Room {

    public int roomNumber;
    public int capacity;
    public ArrayList<Guest> guests;

    public Room (int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(){
        this.guests.remove(0);
    }

    public int numOfGuestsInRoom(){
        return this.guests.size();
    }
}
