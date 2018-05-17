package People;
import java.util.Scanner;

public class People {
    public static void main(String[] args)
    {
        //String[] list = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name");
        String name = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Enter Job Title");
        sc.nextLine();
        String jobTitle = sc.nextLine();
        System.out.println(personInfo(name,age,jobTitle));
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(jobTitle);


    }

    private static String personInfo(String name, int age, String jobTitle)
    {
        return String.format( name+ "%n" + age + "%n" + jobTitle);
    }
}
