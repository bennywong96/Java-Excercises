import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        String[] listNames = new String[];
        int[] listAge = new int[];
        String[] listJobTitles = new String[];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Name");
            String name = sc.nextLine();
            listNames.add(name);
            System.out.println("Enter Age");
            int age = sc.nextInt();
            listAge.add(age);
            System.out.println("Enter Job Title");
            sc.nextLine();
            String jobTitle = sc.nextLine();
            listJobTitles.add(jobTitle);
            System.out.println("Do you want to add more people? (Y/N)");
            String answers = sc.nextLine();
            if (answers.equals("No") || answers.equals("N")) {
                break;
            }
            //System.out.println(personInfo(name, age, jobTitle));

        }
    }
    private static String personInfo(String name, int age, String jobTitle)
    {
        return String.format( name+ "%n" + age + "%n" + jobTitle);
    }
}
