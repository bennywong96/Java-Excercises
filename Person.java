import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String jobTitle;

    public static void main(String[] args) {
//        ArrayList<String> listNames = new ArrayList<String>();
//        ArrayList<Integer> listAge = new ArrayList<Integer>();
//        ArrayList<String> listJobTitles = new ArrayList<String>();
        ArrayList<Person> object = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Name");
            String name = sc.nextLine();
            //listNames.add(name);
            System.out.println("Enter Age");
            int age = sc.nextInt();
            //listAge.add(age);
            System.out.println("Enter Job Title");
            sc.nextLine();
            String jobTitle = sc.nextLine();
            //listJobTitles.add(jobTitle);
            System.out.println("Do you want to add more people? (Y/N)");
            String answers = sc.nextLine();
           //System.out.println(newUser);
            object.add(new Person(name, age, jobTitle));
            if (answers.equals("No") || answers.equals("N") || answers.equals("n") ||
                    answers.equals("no")) {
                break;
            }
            }
        for (Person element : object) {
            System.out.println(element);
        }
        while (true){
            System.out.println("Would you like to search for someone? (Y/N)");
            String search = sc.nextLine();
            if (search.equals("N") || search.equals("No") ||
                    search.equals("no") || search.equals("n")){
                break;
            }
            else
            {
                System.out.println("Please enter a name");
                String searchName = sc.nextLine();
                for(Person element2 : object){
                    if(searchName != null &&
                            element2.getName().toLowerCase().equals(searchName.toLowerCase()))
                    {
                        System.out.println(element2);
                    }

                }
            }
        }
        }


        private Person (String name, int age, String jobTitle){
            this.name=name;
            this.age=age;
            this.jobTitle=jobTitle;
        }
        @Override
        public String toString() {
            return ("Name:"+this.getName()+
                    " Age:"+ this.getAge() +
                    " Job Title:" + this.getJobTitle());
        }
        private String getName() { return name;}
        private int getAge() { return age;}
        private String getJobTitle() { return jobTitle;}
//        private void setName(String name) { this.name = name; }
//        private void setAge (int age) { this.age = age; }
//        private void setJobTitle (String jobTitle) { this.jobTitle=jobTitle;}

}


