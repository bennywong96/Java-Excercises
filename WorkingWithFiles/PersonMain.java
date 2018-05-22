package WorkingWithFiles;

import java.io.IOException;

public class PersonMain {
    public static void main(String[] args) throws IOException {

        PeopleArray newArray = new PeopleArray();
        newArray.populatePeople();
        newArray.iteratingLoop();
        newArray.iteratingReaderLoop();

    }
}
