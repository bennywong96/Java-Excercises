package Basic;

import java.util.Random;

public class IterationsArrays2 {
    public static void main(String[] args)
    {
        int[] list = new int[10] ;

        for (int i=0; i<10; i++) {
            Random random = new Random();
            //random number generator
            int n = random.nextInt(10);
            //limiting the numbers generated to be 0-10
            list[i] = n;
            System.out.println(n);
        }
        System.out.println(java.util.Arrays.toString(list));

        for (int x=0; x<10; x++){
            list[x] = list[x]*10;
            System.out.println(list[x]);
        }
        System.out.println(java.util.Arrays.toString(list));

    }
}
