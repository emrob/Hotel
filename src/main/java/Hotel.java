import java.util.ArrayList;

public class Hotel {
    private Guest guest;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(Guest guest){
        this.guest = guest;
        this.bedrooms = new ArrayList<Bedroom>();
        this.diningrooms = new ArrayList<DiningRoom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkAvailableRooms(){

    }
}


//- (ArrayList Rooms) or do the below arrays
//        - ArrayList Bedrooms -> so can check guests in
//        - ArrayList Dining rooms -> so can add guests just here
//        - in charge of checking guests in and out, but method would be in room (add guest)
//        - Room.addguest(guest)  —> from Room
//
//        use for loop to check available rooms
//        e.g.  for room in rooms, if room. is available add to rooms