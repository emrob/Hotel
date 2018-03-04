import java.util.ArrayList;

public class Hotel {
    private Guest guest;
    private Bedroom bedroom;
    private ArrayList<Bedroom> availableBedrooms;
    private DiningRoom diningRoom;
    private ArrayList<DiningRoom> diningrooms;
    private ConferenceRoom conferenceRoom;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(Guest guest, Bedroom bedroom, ArrayList<Bedroom> availableBedrooms, DiningRoom diningRoom, ArrayList<DiningRoom> diningRooms, ConferenceRoom conferenceRoom, ArrayList<ConferenceRoom> conferenceRooms) {

        this.guest = guest;
        this.bedroom = bedroom;
        this.availableBedrooms = availableBedrooms;
        this.diningRoom = diningRoom;
        this.diningrooms = new ArrayList<DiningRoom>();
        this.conferenceRoom = conferenceRoom;
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }




    public int availableBedRooms(){
       return availableBedrooms.size();

    }

    public int checkin(){
        //add guest to room
        // once added, remove that room from available room array
        if (bedroom.getGuests().size() == 0);
        bedroom.addGuest(guest);
        this.availableBedrooms.remove(0);
        return availableBedrooms.size();
    }

    public void addGuestToDiningRoom(){
        diningRoom.addGuest(guest);

    }

    public String findGuestNameinRoom(){
        bedroom.addGuest(guest);
        return guest.getName();

    }

    public int checkInForNumberOfNIghts(){
        bedroom.addGuest(guest);
        bedroom.setNumOfNights(3);
        return bedroom.getNumOfNights();

    }




}


