package HW1.Part1;

import java.util.ArrayList;

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

        // Сходу не понял, как можно по-другому реализовать создание связей брат/сестра
        // в неявном для пользователя виде. Ищет всех родителей и после добавляет отношение брат/сестра,
        // у которых один родитель.
        ArrayList<Person> parents = new ArrayList<>(new Reserch(gt).findAllParents());

        for (Person person: parents){
            ArrayList<Person> children = new ArrayList<>(new Reserch(gt).findChildPerson(person));
            for (int i = 0; i < children.size(); i++){
                for (int j = 1+i; j <children.size(); j++){
                    gt.append(children.get(i), Relationship.brother, children.get(j));
                }
            }
        }


        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(masha,
                Relationship.sister));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.brother));
    }
}