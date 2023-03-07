package HW1.Part1;

public class Node {
    public Node(Person p1, Relationship re, Person p2) {
        if (checkNullPerson(p1, p2)) {
            this.p1 = p1;
            this.re = re;
            this.p2 = p2;
        } else {
            System.out.println("Ошибка создания связи. Передано null.");
        }
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
    private boolean checkNullPerson(Person person1, Person person2){
        return (person1 != null && person2 != null);
    }
}
