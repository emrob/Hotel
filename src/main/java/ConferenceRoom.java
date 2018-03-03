public class ConferenceRoom extends Room {

    private int hourlyCharge;

    public ConferenceRoom(int roomNumber, int capacity, int hourlyCharge){
        super(roomNumber, capacity);
        this.hourlyCharge = hourlyCharge;
    }

    public int getHourlyRate() {
        return hourlyCharge;
    }
}
