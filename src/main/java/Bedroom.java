public class Bedroom extends Room {

    private int nightlyRate;
    private int numOfNights;
    private String type;



    public Bedroom(int roomNumber, int capacity, int nightlyRate, int numOfNights, String type){
           super(roomNumber, capacity);
           this.nightlyRate = nightlyRate;
           this.numOfNights = numOfNights;
           this.type = type;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }



    public String getType() {
        return this.type;
    }
}
