public class Van extends Vehicle {

    //big or small van
    private String vanSize;

    public Van (int id, String model, String colour, int doors, int cc,
               String vanSize, int price){
        super(id, model, colour, doors, cc, price);
        this.vanSize=vanSize;
    }

    public void typeOfVehicle() {
        System.out.println("This is a Van");
    }

}
