import java.util.Random;

public class Arrays {
    public static void main(String[] args)
    {
        int[] list = new int[10] ;
        for (int i=0; i<10; i++) {
            Random random = new Random();
            int n = random.nextInt(100);
            list[i] = n;
        }
        System.out.println(Conditional2.newInt(list[2],list[4]));
        System.out.println(java.util.Arrays.toString(list));
    }
}
