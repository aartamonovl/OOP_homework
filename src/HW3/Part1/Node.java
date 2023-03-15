package HW3.Part1;

public class Node {

    private Person p1;
    private Relationship re;
    private Person p2;

    /** *
     * Создание отношения
     *
     * @param p1 - персона
     * @param re - в отношении
     * @param p2 - к этой персоне
     */
    public Node(Person p1, Relationship re, Person p2) {
        if (checkNullPerson(p1, p2)) {
            this.p1 = p1;
            this.re = re;
            this.p2 = p2;
        } else {
            System.out.println("Ошибка создания связи. Передано null.");
        }
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Relationship getRe() {
        return re;
    }

    public void setRe(Relationship re) {
        this.re = re;
    }

    public Person getP2() {
        return p2;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

    @Override
    public int hashCode() {
        StringBuilder hash = new StringBuilder();
        hash.append(this.p1.getFullName().hashCode());
        hash.append(this.p2.getFullName().hashCode());
        hash.append(this.re.hashCode());
        return hash.hashCode();
    }

    private boolean checkNullPerson(Person person1, Person person2){
        return (person1 != null && person2 != null);
    }
}
