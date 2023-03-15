package HW3.Part2;

import java.util.ArrayList;
import java.util.List;

public class Closet extends Stuff {
    private List<Door> doorList = new ArrayList<>();

    public Closet(String room, Integer countDoors, String type) {
        super(room, type);
        setDoors(countDoors);
    }

    public Integer getCountDoors() {
        return doorList.size();
    }

    public void setDoors(Integer countDoors) {
        for (int i = 1; i <= countDoors; i++){
            String nameDoor = String.format("%d", i);
            Door door = new Door(nameDoor, 100);
            doorList.add(door);
        }
    }


    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> newDoorList) {
        for (Door door: newDoorList) {
            doorList.add(door);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; Количество дверей: %d", super.toString(), doorList.size());
    }
}
