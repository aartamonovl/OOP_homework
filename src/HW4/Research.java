package HW4;

import HW1.Part1.Node;
import HW1.Part1.Person;
import HW1.Part1.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Research<T>{
//    ArrayList<String> result = new ArrayList<>();
    private ArrayList<T> resultT = new ArrayList<>();
    private List<T> tree = new ArrayList<>();

    public Research(List<T> list) {
        tree.addAll(list);
    }
    public ArrayList<T> spend(String id) {
        if (tree.get(0).getClass().equals(User.class)){
            for (T data : tree){
                String idd = String.valueOf(((User) data).getId());
                if (id.equals(idd)){
                    resultT.add(data);
                }
            }
        } else {
            for (T data : tree){
                if (id.equals(((Task) data).getId())){
                    resultT.add(data);
                }
            }
        }
        return resultT;
    }
}
