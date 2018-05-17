import java.util.ArrayList;

public class Garage {
    private int id;
    private int price;
    private String model;
    private String colour;
    private int doors;
    private int cc;
    ArrayList<Vehicle> garage = new ArrayList<>();

    public void addGarage(Vehicle vehicle){
        garage.add(vehicle);
    }

    public void allCosts(){
        double total=0.0;
        for (Vehicle test : garage){
            total+= test.getPrice();
            System.out.println(test.toString());
        }
        System.out.println("Total Costs= " + total);
    }






}
