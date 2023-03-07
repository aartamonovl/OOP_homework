package HW1.Part1;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person person1, Relationship re, Person person2) {
        if (checkNullPerson(person1, person2)) {
            switch (re) {
                case parent:
                    appendParent(person1, person2);
                    break;
                case brother:
                case sister:
                    appendBrosSis(person1, person2);
                    break;
                case husband:
                case wife:
                    appendHusbandWife(person1, person2);
                    break;
                default:
                    System.out.println("Данный тип взаимоотношений пока не поддерживается.");
            }
        } else {
            System.out.println("Не может быть передано null.");
        }
    }
    private void appendParent(Person person1, Person person2){
        if (checkNullPerson(person1, person2)) {
            tree.add(new Node(person1, Relationship.parent, person2));
            tree.add(new Node(person2, Relationship.children, person1));
        } else {
            System.out.println("В нашей стране нет однополых браков.");
        }
    }
    private void appendBrosSis(Person person1, Person person2){
        if (person1.getGender().equals(Gender.man)){
            tree.add(new Node(person1, Relationship.brother, person2));
        } else {
            tree.add(new Node(person1, Relationship.sister, person2));
        }
        if (person2.getGender().equals(Gender.man)){
            tree.add(new Node(person2, Relationship.brother, person1));
        } else {
            tree.add(new Node(person2, Relationship.sister, person1));
        }
    }

    private void appendHusbandWife(Person person1, Person person2){
        if (checkGenderPerson(person1, person2)) {
            if (person1.getGender().equals(Gender.man)) {
                tree.add(new Node(person1, Relationship.husband, person2));
                tree.add(new Node(person2, Relationship.wife, person1));
            } else if (person1.getGender().equals(Gender.woman)) {
                tree.add(new Node(person1, Relationship.husband, person2));
                tree.add(new Node(person1, Relationship.wife, person2));
            }
        } else {
            System.out.println("В нашей стране нет однополых браков.");
        }
    }

    private boolean checkNullPerson(Person person1, Person person2){
        return (person1 != null && person2 != null);
    }
    private boolean checkGenderPerson(Person person1, Person person2){
        return (person1.getGender() != person2.getGender());
    }
}
