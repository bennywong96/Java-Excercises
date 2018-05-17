public class GarageMain {

    public static void main(String[] args) {
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

        Garage garage1 = new Garage();
        garage1.addGarage(c1);
        garage1.addGarage(c2);
        garage1.addGarage(v1);
        garage1.addGarage(v2);
        garage1.addGarage(m1);

        c1.typeOfVehicle();
        //c1 is a car
        c2.typeOfVehicle();
        boolean newLoop = false;
        while (newLoop=false){

        }
        garage1.allCosts();

    }

}
