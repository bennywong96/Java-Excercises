package TooHot;
import java.util.Scanner;

public class TooHot {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Temperature");
        int x = sc.nextInt();
        boolean q=false;
        System.out.println("Is it Summer? (Y/N)");
        String y = sc.next();

        if (y.equals("Y") || y.equals("Yes"))
        {
            q=true;
        }
        else if (y.equals("N") || y.equals("No"))
        {
            q=false;
        }

        System.out.println(temperature(x,q));


    }
    static boolean temperature (int a, boolean b) {
        if (b)
        {

            if (a<=100 && a>= 60)
            {
                b=true;
            }
            else
            {
                b=false;
            }
        }
        else if (!b)
        {
            if (a<=90 && a>= 60)
            {
                b=true;
            }
            else
            {
                b=false;
            }
        }

        return b;
    }


}
