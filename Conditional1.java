public class Conditional1 {
    public static void main(String[] args)
    {
        System.out.println(newInt(1,4,true));
        System.out.println(newInt(4,6,false));
    }
    public static int newInt(int a, int b, boolean c){
        if (c == true)
        {
            return a+b;
        }
        else{
            return a*b;
        }

    }
}
