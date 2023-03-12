package HW2.Part1;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", Gender.woman);
        Person vasya = new Person("Вася", Gender.man);
        Person masha = new Person("Маша", Gender.woman);
        Person jane = new Person("Женя", Gender.woman);
        Person ivan = new Person("Ваня", Gender.man);
        Person andrew = new Person("Андрей", Gender.man);
        Person alex = new Person("Александр", Gender.man);
        Person none = new Person();
        Person none1 = new Person();
        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya);
        gt.append(irina, Relationship.parent, masha);
        gt.append(irina, Relationship.parent, none);
        gt.append(vasya, Relationship.parent, jane);
        gt.append(vasya, Relationship.parent, ivan);
        gt.append(irina, Relationship.parent, none1);
        gt.append(andrew, Relationship.brother, alex);

        System.out.println(gt.modifyPersonListToStringName(gt.spend(irina,
                                                                    Relationship.children)));
        System.out.println();
        System.out.println(gt.modifyPersonListToStringName(gt.spend(andrew,
                                                                    Relationship.brother)));
        System.out.println();
        System.out.println(gt.modifyPersonListToStringName(gt.spend(vasya,
                                                                    Relationship.brother)));
        System.out.println();
    }
}