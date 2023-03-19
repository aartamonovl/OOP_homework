package HW4;

import java.util.ArrayList;
import java.util.List;

public class User implements Comparable<User>, Show<User>{
    private static List<User> userList = new ArrayList<>();
    private int id;
    private String name;
    private String lastName;
    private String midName;
    private static int uid = 0;

    public User(String name, String lastName, String midName) {
        this.id = uid++;
        this.name = name;
        this.lastName = lastName;
        this.midName = midName;
        userList.add(this);
    }

    public static void createStartUsers(){
        new User("Петров", "Петр", "Петрович");
        new User("Петров1", "Петр1", "Петрович1");
        new User("Петров2", "Петр2", "Петрович2");
    }

    @Override
    public void showAll() {
        for(User user: userList){
            System.out.println(user);
        }
    }

    @Override
    public void show(List<User> list) {
        for(User user: list){
            System.out.println("Id: " + user.id + ", " + user);
        }
    }

    @Override
    public int compareTo(User o) {
        return this.getId() - o.getId();
    }

//    @Override
//    public String toString() {
//        return String.format("ФИО: %s %s %s", lastName, name, midName);
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        return this.getId() == ((User) obj).getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public static List<User> getList() {
        return userList;
    }
}
