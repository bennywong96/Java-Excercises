package PaintWizard;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintWizard {
    private ArrayList<PaintDetails> paintList = new ArrayList<>();
    private PaintDetails one = new PaintDetails("CheapoMax", 20, 19.99, 200);
    private PaintDetails two = new PaintDetails("AverageJoes", 15,17.99,165);
    private PaintDetails three = new PaintDetails("DuluxourousPaints", 10, 25, 200);

    private Scanner sc = new Scanner(System.in);
    private String cheapestOne;
    private double cheapestPrice=1000000;
    private double wasteCalculation;
    private double wasteCalculation2 = 100000;
    private String leastWasted;
    private double totalPrice;
    private int i = 0;

    void printOuts(){
        System.out.println("Welcome");
        boolean test = true;
        while(test) {
            System.out.println("Want to view the list of paints available? (Y/N)");
            String answer = sc.nextLine();
            if(answer.toLowerCase().equals("y")){
                for (PaintDetails abc : paintList){
                    System.out.println("Brand:" + abc.name +
                    ", Number of Litres:" + abc.litres + ", Price:£" + abc.price );
                }
            }
            else if (answer.toLowerCase().equals("n")){
                break;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
    }

    void calculatePaint(){
        PaintRoom roomSize = new PaintRoom();
        double size = roomSize.size();
        for (i=0; i<paintList.size(); i++){
            double numOfCans = (int) Math.ceil(size / paintList.get(i).coverage);
            System.out.println("numofcans " + numOfCans);
            double totalCoverage = numOfCans * paintList.get(i).coverage;
            System.out.println("Total cov " + totalCoverage);
             totalPrice = numOfCans *paintList.get(i).price;
            System.out.println("total price "+ totalPrice);
            wasteCalculation = totalCoverage -size;
            System.out.println("waste 1 " + wasteCalculation);
            System.out.println("waste 2 " + wasteCalculation2);
            calculateWaste();
            calculatePrice();
        }


        divideByName();
        cheapestPrice=Math.round(cheapestPrice * 100d) / 100d;
        wasteCalculation2=Math.round(wasteCalculation2* 100d)/100d;
        System.out.println("The cheapest one for your " + size + "m2 room is " +
                            cheapestOne + " at " + cheapestPrice);

        System.out.println("The one that wastes the least is " + leastWasted + " it only wastes "+
                            wasteCalculation2 + " litres");


    }

    private void addPaint(PaintDetails newPaint){ paintList.add(newPaint); }

    void initialPaint(){
        addPaint(one);
        addPaint(two);
        addPaint(three);
    }


    private void divideByName(){
        if(leastWasted.equals("CheapoMax")){
            wasteCalculation2=wasteCalculation2/10;
        }
        if(leastWasted.equals("AverageJoes")){
            wasteCalculation2=wasteCalculation2/11;
        }
        if (leastWasted.equals("DuluxourousPaints")){
            wasteCalculation2=wasteCalculation2/20;
        }
    }

    private void calculatePrice(){
        if (totalPrice<cheapestPrice){
            cheapestOne = paintList.get(i).name;
            cheapestPrice = totalPrice;
        }
    }

    private void calculateWaste(){
        if (wasteCalculation<wasteCalculation2){
            wasteCalculation2 = wasteCalculation;
            leastWasted = paintList.get(i).name;
        }
    }

}
