package PaintWizard;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintWizard {
    ArrayList<PaintDetails> paintList = new ArrayList<>();



    Scanner sc = new Scanner(System.in);
    boolean test = true;

    public void printOuts(){
        System.out.println("Welcome");
        while(test) {
            System.out.println("Want to view the list of paints available? (Y/N)");
            String answer = sc.nextLine();
            if(answer.toLowerCase().equals("y")){
                for (PaintDetails abc : paintList){
                    System.out.println("Brand:" + abc.name +
                    ", Number of Litres:" + abc.litres + ", Price:£" + abc.price );
                    break;
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

    public void addPaint(PaintDetails newPaint){ paintList.add(newPaint); }

    public void initialPaint(){
        PaintDetails one = new PaintDetails("CheapoMax", 20, 19.99, 200);
        PaintDetails two = new PaintDetails("AverageJoes", 15,17.99,165);
        PaintDetails three = new PaintDetails("DuluxourousPaints", 10, 25, 200);
        addPaint(one);
        addPaint(two);
        addPaint(three);
    }

}
