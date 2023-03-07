package HW1.Part2;

import java.util.ArrayList;
import java.util.List;

public class Closet {
    private String room;
    private Integer countDoors;
    private String type;
    private List<Door> doorList = new ArrayList<>();

    public Closet(String room, Integer countDoors, String type) {
        this.room = room;
        this.countDoors = countDoors;
        this.type = type;
        for (int i = 1; i <= countDoors; i++){
            String nameDoor = String.format("%d", i);
            Door door = new Door(nameDoor, 100);
            doorList.add(door);
        }
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(Integer countDoors) {
        this.countDoors = countDoors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> doorList) {
        this.doorList = doorList;
    }

    @Override
    public String toString() {
        return String.format("Комната: %s; Количество дверей: %d; Тип шкафа: %s", room, countDoors, type);
    }
}
