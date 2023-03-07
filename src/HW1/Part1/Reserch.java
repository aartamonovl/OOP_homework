package HW1.Part1;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Person> resultPerson = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
    public ArrayList<Person> findChildPerson(Person parent) {
            for (Node t : tree) {
                if (t.p1.getFullName() == parent.getFullName() && t.re == Relationship.parent) {
                    resultPerson.add(t.p2);
                }
            }
        return resultPerson;
    }

    public ArrayList<Person> findAllParents(){
        ArrayList<Person> res = new ArrayList<>();
        for (Node t: tree){
            if (t.re == Relationship.parent && !res.contains(t.p1)){
                res.add(t.p1);
            }
        }
        return res;
    }
}
