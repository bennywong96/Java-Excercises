import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class UniqueSum {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(uniqueSum(x,y,z));


    }

        private static int uniqueSum(int a, int b, int c){
        int lastSum=0;
        if (a==b && a==c && b==c)
        {
            lastSum=0;

        }
        else if (a==c)
        {
            lastSum=b;

        }
        else if (b==c)
        {
            lastSum=a;
        }

        else if (a==b){
            lastSum=c;
        }

        else {
            lastSum=a+b+c;
        }

        return lastSum;
    }
}
