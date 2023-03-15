package HW3.Part1;

import java.util.ArrayList;

public interface Reserch {
    ArrayList<Person> spend(Person person, Relationship re);
    ArrayList<String> modifyPersonListToStringName(ArrayList<Person> personArrayList);
}
