public class GarageMain {

    public static void main(String[] args) {
        Car vh = new Car(1,"Vauxhall", "Blue", 3, 1100,"A","AT", 2000 );

        Garage garage1 = new Garage();
        garage1.addGarage(vh);
    }

}
