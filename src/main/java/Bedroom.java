public class Bedroom extends Room {

    private int nightlyRate;
    private int numOfNights;



    public Bedroom(int roomNumber, int capacity, int nightlyRate, int numOfNights){
           super(roomNumber, capacity);
           this.nightlyRate = nightlyRate;
           this.numOfNights = numOfNights;
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

}
