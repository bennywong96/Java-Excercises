public class Car extends Vehicle{

    String transmission;
    String gears;
    //tranmission type
    //number of gears

    Car(int id, String model, String colour, int doors, int cc,
               String transmission, String gears, int price){
        super(id, model, colour, doors, cc, price);
        this.transmission=transmission;
        this.gears=gears;
    }

    public void typeOfVehicle() {
        System.out.println("This is a Car");
    }

}
