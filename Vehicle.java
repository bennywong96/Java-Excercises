public class Vehicle {

    /*
    Price of Vehicle double
    Model of Vehicle string
    Colour of Vehicle string
    Number of Doors int
    Engine CC int
     */
    public int id;
    public int price;
    public String model;
    public String colour;
    public int doors;
    public int cc;
    public Vehicle (int id, String model, String colour, int doors, int cc, int price){
        this.id=id;
        this.model=model;
        this.colour=colour;
        this.doors=doors;
        this.cc=cc;
        this.price=price;
    }

    //set method
    public void setId() {
        this.id=id;
    }

    public void setPrice(){
        this.price = price;
    }
    public void setModel(){
        this.model=model;
    }
    public void setColour(){
        this.colour=colour;
    }

    public void setDoors(){
        this.doors=doors;
    }

    public void setCc() {
        this.cc=cc;
    }

    //get
    public int getId() { return id;}
    public int getPrice(){ return price;}
    public String getModel() {return model;}
    public String getColour() {return colour;}
    public int getDoors() {return doors;}
    public int getCc() {return cc;}

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
