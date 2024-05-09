package Models;

public abstract class Vehicle {

    private int ID;
    private String title;
    private String vehicleCode;
    private float price;
    private int quantity;
    private EnergyType eType;

    private static int counter = 10000;

    //getters
    public int getId() {return ID;}
    public String getTitle() {return title;}
    public String getVehicleCode() {return vehicleCode;}
    public float getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public EnergyType geteType() {return eType;}


    //setters
    public void setId() {
        this.ID = counter;
        counter++;
    }
    public void setTitle(String title) {
        if(title != null && title.matches("[A-Za-z ]{3,20}")){
            this.title = title;
        }
        else this.title = "Undefined title";
    }
    public void setVehicleCode() {
        this.vehicleCode = ID + " " +title;

    }
    public void setPrice(float price) {
        if(price > 0 && price <= 1000000) {
            this.price = price;
        }else{
            this.price = 10;
        }
    }
    public void setQuantity(int quantity) {
        if(quantity > 0 && quantity <= 10000){
            this.quantity = quantity;
        }else{
            this.quantity = 1;
        }
    }
    public void seteType(EnergyType eType) {
        if(eType != null){
            this.eType = eType;
        }else{
            this.eType = EnergyType.not_specified;
        }
    }

    //default constructor
    public Vehicle(){
        setId();
        setTitle("Vehicle");
        setVehicleCode();
        setPrice(10.00f);
        setQuantity(1);
        seteType(EnergyType.not_specified);
    }
    //custom constructor
    public Vehicle( String title, String vehicleCode, float price, int quantity, EnergyType eType) {
        setId();
        setTitle(title);
        setVehicleCode();
        setPrice(price);
        setQuantity(quantity);
        seteType(eType);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", vehicleCode='" + vehicleCode + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", eType=" + eType +
                '}';
    }
}
