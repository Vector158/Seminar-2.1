package Models;

public class Bus extends Vehicle {

    private int numberOfSeats;
    private boolean hasBaggageDivision;

    public int getNumberOfSeats() {return numberOfSeats;}
    public boolean isHasBaggageDivision() {return hasBaggageDivision;}

    public void setNumberOfSeats(int numberOfSeats) {
        if(numberOfSeats >0){
            this.numberOfSeats = numberOfSeats;
        }else{
            this.numberOfSeats = 1;
        }
    }
    public void setHasBaggageDivision(boolean hasBaggageDivision) {
        this.hasBaggageDivision = hasBaggageDivision;
    }

    public Bus(){
        super();
        setNumberOfSeats(1);
        setHasBaggageDivision(true);
    }

    public Bus(String title, String vehicleCode, float price, int quantity, EnergyType eType, int numberOfSeats, boolean hasBaggageDivision) {
        super(title, vehicleCode, price, quantity, eType);
        setNumberOfSeats(numberOfSeats);
        setHasBaggageDivision(true);
    }

    @Override
    public String toString() {
        return "Bus{" + getVehicleCode().toString() +
                "numberOfSeats=" + numberOfSeats +
                ", hasBaggageDivision=" + hasBaggageDivision +
                '}';
    }
}
