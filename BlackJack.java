import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = 21-x;
        int d = 21-y;

        if (c<d && x>0 && x<21 && y>0 && y<21){
            System.out.println("Your first number, " + x + " was the closest to 21.");
        }
        else if (d<c && x>0 && x<21 && y>0 && y<21){
            System.out.println("Your second number, " + y + " was the closest to 21.");
        }

        else if (x>21 && y>21){
            System.out.println("Both number are over 21 so you get 0");
        }
        else if (x==y){
            System.out.println(x + ", " + y + " Both numbers are the same");
        }

        else if (x<1 || y<1) {
            System.out.println("Number cannot be below 1");
        }

        else if (x>21 && y< 21)
        {
            System.out.println("First number is too high, Second number is closest to 21");
        }

        else if (x<21 && y>21)
        {
            System.out.println("Second number is too high, First number is closest to 21");
        }
        else
            System.out.println("Error");
    }
}
