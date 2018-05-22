package WorkingWithFiles;
import java.util.ArrayList;
import java.io.*;

public class PeopleArray {

        ArrayList<Person> newPeople = new ArrayList<>();
        ArrayList<Person> readPeople = new ArrayList<>();
        private Person one = new Person("Adam","IT Consultant",20);
        private Person two = new Person("Bob","Marketing",30);
        private Person three = new Person("Callum","HR",23);
        private Person four = new Person ("Dan","Finance",28);
        private Person five = new Person("Enys", "R&D",27);

        public void iteratingLoop() throws IOException {
            BufferedWriter bw = null;
            FileWriter fw = null;
            fw = new FileWriter("test4.txt");
            bw = new BufferedWriter(fw);

            try {
                for (Person peep : newPeople) {
                    String bwName = peep.name;
                    String bwOccupation = peep.occupation;
                    int bwAge = peep.age;
                    bw.write("Name:" + bwName +", Occupation:" + bwOccupation+ ", Age:"+ bwAge + "\n");
                }
            } finally {

                try {
                        bw.close();
                        fw.close();
                } catch (IOException ex) {

                    ex.printStackTrace();

                }

            }
        }

        public void iteratingReaderLoop() throws IOException {
            BufferedReader br = null;
            FileReader fr = null;
            fr = new FileReader("C:\\Users\\Admin\\IdeaProjects\\HelloWorld\\test3.txt");
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] items = line.split(",");
                String partName = items[0];
                String partOccupation = items[1];
                String partAge = items[2];
                String subStringAge = partAge.substring(5);
                addPeople2(new Person (partName.substring(5),partOccupation.substring(12), Integer.parseInt(subStringAge) ));
            }

            System.out.println("New Array List from ReadFile");
            for (Person test:readPeople){
                System.out.println("Name:" + test.name + "\n"+ "Occupation:" + test.occupation + "\n" +
                                    "Age:" + test.age + "\n");
            }

            fr.close();


        }



        public void addPeople(Person newPerson){newPeople.add(newPerson);}
        public void addPeople2 (Person newPerson) {readPeople.add(newPerson);}

        public void populatePeople(){
            addPeople(one);
            addPeople(two);
            addPeople(three);
            addPeople(four);
            addPeople(five);
        }
}
