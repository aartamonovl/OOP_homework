package HW4;

import java.util.HashMap;

public class Priority {
    private static HashMap<Integer, String> priority = new HashMap<>();

    public static void createDict(){
        priority.put(0,"Низкий");
        priority.put(1,"Средний");
        priority.put(2,"Немедленное выполнение");
    }

    public static String findValue(int prior){
        return priority.getOrDefault(prior, null);
    }

}
