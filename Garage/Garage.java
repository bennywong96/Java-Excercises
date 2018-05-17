package Garage;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    ArrayList<Vehicle> garage = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean newLoop = true;

    void startingList(){
        Car c1 = new Car(1,"Vauxhall", "Blue", 3,
                1100,"A","AT", 2000 );
        Car c2 = new Car(2, "Honda", "Red", 5, 1639,
                "M", "6", 3400);
        Van v1 = new Van(3, "Might as Well be a Lorry", "White",
                3, 2500, "Big", 8600);

        Van v2 = new Van(4, "Close to a Car", "Black",
                3, 2500, "Small", 4600);

        Motorcycle m1 = new Motorcycle(5, "Broom Broom", "Purple", 0,
                2000, "Sport", 5400);
        addGarage(c1);
        addGarage(c2);
        addGarage(v1);
        addGarage(v2);
        addGarage(m1);
    }



    private void addGarage(Vehicle vehicle){
        garage.add(vehicle);
    }

    private void removeGarageByID(){
        while(newLoop) {
            System.out.print("Please type in the ID number of vehicle you would like to remove:");
            int x = sc.nextInt();
            int zero = 0;
            sc.nextLine();
            for (int j = 0; j < garage.size(); j++) {
                if (x == garage.get(j).id) {
                    System.out.println(garage.get(j));
                    garage.remove(j);
                    System.out.println("Vehicle ID " + x + " has been removed.");
                    newLoop=false;
                    zero++;
                }
            }
            if (zero==0){
                System.out.println("Invalid ID, please try again.");
            }
        }
        System.out.println(garage);
    }

    private void removeGarageByType() {
        while (newLoop) {
            System.out.print("Please enter the model you want to remove:");
            String x = sc.nextLine();
            int zero = 0;
            for (int j = 0; j < garage.size(); j++) {
                if (x.toLowerCase().equals(garage.get(j).model.toLowerCase())) {
                    System.out.println(garage.get(j));
                    garage.remove(j);
                    System.out.println("Vehicle " + x + " has been removed");
                    newLoop=false;
                    zero++;
                }
            }
            if (zero==0){
                System.out.println("Invalid Model/Name, please try again.");
            }

        }
        System.out.println(garage);
    }

    private void removeGarage(){
        System.out.println(garage);
        garage.clear();
        System.out.println(garage);
        System.out.println("Garage is now Empty");
    }

    private void allCosts(){
        double total=0.0;
        double c = 0.0;
        double v = 0.0;
        double m = 0.0;
        for (Vehicle test : garage){
            if (test instanceof Car){
                System.out.println("ID:" + test.id + "\n" +
                        "Model:" + test.model + ", Colour:" + test.colour  +
                        ", Doors:" + test.doors  + ", Engine Size:" + test.cc  +
                        ", Transmission Type:" + ((Car) test).transmission  +
                        ", Number of Gears:" + ((Car) test).gears  + ", Price:" + test.price);
                         c+= ((Car)test).getPrice();
            }

            else if ( test instanceof Van){
                System.out.println("ID:" + test.id + "\n" +
                        "Model:" + test.model + ", Colour:" + test.colour  +
                        ", Doors:" + test.doors  + ", Engine Size:" + test.cc  +
                        ", Van Size:" + ((Van) test).vanSize  + ", Price:" + test.price);
                        v+= ((Van)test).getPrice();
            }

            else if ( test instanceof Motorcycle){
                System.out.println("ID:" + test.id + "\n" +
                        "Model:" + test.model + ", Colour:" + test.colour  +
                        ", Doors:" + test.doors  + ", Engine Size:" + test.cc  +
                        ", Motorcycle Type:" + ((Motorcycle) test).motorcycleType + ", Price:" + test.price );
                        m+= ((Motorcycle)test).getPrice();
            }
            test.typeOfVehicle();
            System.out.println();
            total+= test.getPrice();
        }
        System.out.println("\n"+ "Total Costs for Cars= " + c);
        System.out.println("\n"+ "Total Costs for Vans= " + v);
        System.out.println("\n"+ "Total Costs for Motorcycles= " + m);
        System.out.println("\n" + "Overall Costs= " + total);

    }


    void printOut(){

        while (newLoop) {
            System.out.println("Welcome Would you like to know what is in the Garage? (Y/N)");
            String answer = sc.nextLine();
            if (answer.toLowerCase().equals("y")) {
                allCosts();
                break;
            }
            else if (answer.toLowerCase().equals("n")){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        while (newLoop) {
            System.out.println("Do you want to remove a vehicle by ID or Type? Type No to move on");
            String answer2 = sc.nextLine();
            if (answer2.toLowerCase().equals("id")) {
                removeGarageByID();
                break;
            } else if (answer2.toLowerCase().equals("type")) {
                removeGarageByType();
                break;
            }
            else if (answer2.toLowerCase().equals("no")){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        while (newLoop){
            System.out.println("Do you want to clear the garage?");
            String answer3 = sc.nextLine();
            if (answer3.toLowerCase().equals("y")){
                removeGarage();
                break;
            }
            else if (answer3.toLowerCase().equals("n")){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }





}
