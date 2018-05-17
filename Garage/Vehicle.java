public class Vehicle {

    /*
    Price of Vehicle double
    Model of Vehicle string
    Colour of Vehicle string
    Number of Doors int
    Engine CC int
     */
    int id;
    int price;
    String model;
    String colour;
    int doors;
    int cc;
    Vehicle (int id, String model, String colour, int doors, int cc, int price){
        this.id=id;
        this.model=model;
        this.colour=colour;
        this.doors=doors;
        this.cc=cc;
        this.price=price;
    }


    //get
    private int getId() { return id;}
    int getPrice(){ return price;}
    private String getModel() {return model;}
    private String getColour() {return colour;}
    private int getDoors() {return doors;}
    private int getCc() {return cc;}

    public void typeOfVehicle() {
        System.out.println("This is a Vehicle");
    }

    @Override
    public String toString() {
        return ("ID:"+this.getId()+
                "Model:"+ this.getModel() +
                "Colour:" + this.getColour()+
                "Doors:" + this.getDoors() +
                "Engine:" + this.getCc());
    }


}
