package HW4;

import java.util.Comparator;

public class SortTaskByPriority implements Comparator<Task> {
    public SortTaskByPriority(){
        super();
    }

    @Override
    public int compare(Task o1, Task o2) {
        return Integer.parseInt(o1.getPriority()) - Integer.parseInt(o2.getPriority());
    }

    @Override
    public Comparator<Task> reversed() {
        return Comparator.super.reversed();
    }
}
