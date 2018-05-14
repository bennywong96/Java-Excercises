import java.util.Random;

public class IterationArrays {
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

    }
}
