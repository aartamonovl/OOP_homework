package HW2.Part1;

import java.util.ArrayList;

public class GeoTree implements Reserch{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person person1, Relationship re, Person person2) {
        if (checkNullPerson(person1, person2) && checkGenderPerson(person1.getGender(), re, person2.getGender())) {
            tree.add(new Node(person1, re, person2));
            tree.add(new Node(person2, reverseRelationship(re, person2.getGender()), person1));
            if (re == Relationship.parent){
                ArrayList<Person> p = new ArrayList<>(spend(person1, reverseRelationship(re, person1.getGender())));
                Relationship relBro = Relationship.sister;
                if (person2.getGender() == Gender.man){
                    relBro = Relationship.brother;
                }
                for (Person person: p){
                    if (!person.getFullName().equals(person2.getFullName())) {
                        tree.add(new Node(person2, relBro, person));
                        tree.add(new Node(person, reverseRelationship(relBro, person.getGender()), person2));
                    }
                }
            }
        } else {
            System.out.println("Не может быть передано null.");
        }
    }


    @Override
    public ArrayList<Person> spend(Person person, Relationship re) {
        ArrayList<Person> personList = new ArrayList<>();
        for (Node node: this.getTree()) {
            if (node.getP2().getFullName().equals(person.getFullName()) &&
                node.getRe().equals(re)){
                personList.add(node.getP1());
            }
        }
        return personList;
    }

    @Override
    public ArrayList<String> modifyPersonListToStringName(ArrayList<Person> personArrayList) {
        ArrayList<String> fullNamePersons = new ArrayList<>();
        for (Person person: personArrayList){
            fullNamePersons.add(person.getFullName());
        }
        return fullNamePersons;
    }

    private Relationship reverseRelationship (Relationship re, Gender gender){
        Relationship revRel = null;
        switch (re){
            case parent -> {
                revRel = Relationship.children;
            }
            case children -> {
                revRel = Relationship.parent;
            }
            case sister -> {
            }
            case brother -> {
                if (gender == Gender.man){
                    revRel = Relationship.brother;
                } else {
                    revRel = Relationship.sister;
                }
            }
            case wife -> {
                revRel = Relationship.husband;
            }
            case husband -> {
                revRel = Relationship.wife;
            }
        }
        return revRel;
    }

    private boolean checkNullPerson(Person person1, Person person2){
        return (person1 != null && person2 != null);
    }
    private boolean checkGenderPerson(Gender g1, Relationship re, Gender g2){
        switch (re){
            case wife -> {
            }
            case husband -> {
                System.out.println("Однополые браки запрещены.");
                return (g1 != g2);
            }
        }
        return true;
    }
}
