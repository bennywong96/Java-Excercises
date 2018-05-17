public class Conditional2 {
    public static void main(String[] args)
    {
        for (int i = 0; i<10; i++) {
            System.out.println(newInt(12, i));

        }
    }
    public static int newInt(int a, int b){
        if (a == 0)
        {
            return b;
        }
        else if (b == 0){
            return a;
        }
        else
        {
            return a+b;
        }

    }
}
