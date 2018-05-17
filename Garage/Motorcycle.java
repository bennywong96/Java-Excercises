public class Motorcycle extends Vehicle {

    //normal or sport
    String motorcycleType;
    Motorcycle(int id, String model, String colour, int doors, int cc,
               String motorcycleType, int price){
        super(id, model, colour, doors, cc, price);
        this.motorcycleType=motorcycleType;
    }

    public void typeOfVehicle() {
        System.out.println("This is a Motorcycle");
    }
}
