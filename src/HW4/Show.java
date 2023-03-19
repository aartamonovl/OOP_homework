package HW4;

import java.util.List;
import java.util.UUID;

public interface Show<O> {
    void showAll();
    void show(List<O> list);
}
