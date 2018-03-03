public class Guest {

    private String name;
    private double bill;


    public Guest (String name) {
        this.name = name;
        this.bill = 0;
    }


    public String getName() {
        return name;
    }

    public double getBill() {
        return bill;
    }

    public void roomCharge(double amount) {
        this.bill += amount;
    }

    public void refund(double amount) {
        this.bill -= amount;
    }



}
