package HW3.Part2;

public class Human implements DoWithDoor {
    private String name;
    private Integer age;
    private String room;

    public Human(String name, Integer age, String room) {
        this.name = name;
        this.age = age;
        this.room = room;
    }

    public Human(String name, Integer age) {
        this(name, age, "Прихожая");
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private void moveToCloset(Closet closet){
        if (this.room.equals(closet.getRoom())){
            System.out.println("Подойти к шкафу.");
        } else {
            System.out.println("Зайти в комнату, где стоит шкаф и подойти к шкафу.");
            this.room = closet.getRoom();
        }
    }

    @Override
    public void openDoor(Closet closet, Door door){
        moveToCloset(closet);
        System.out.println("Попробовать открыть дверь.");
        if (door.getState() == State.close){
            door.setState(State.open);
            door.setCondition(door.getCondition() - 5);
            System.out.println("Дверь открыта.");
        } else {
            System.out.println("Дверь уже открыта");
        }
        System.out.println(door);
    }
    @Override
    public void closeDoor(Closet closet, Door door){
        moveToCloset(closet);
        System.out.println("Попробовать закрыть дверь.");
        if (door.getState() == State.open){
            door.setState(State.close);
            door.setCondition(door.getCondition() - 5);
            System.out.println("Дверь закрыта.");
        } else {
            System.out.println("Дверь уже закрыта.");
        }
        System.out.println(door);
    }

    @Override
    public void greaseDoor(Closet closet, Door door){
        moveToCloset(closet);
        openDoor(closet, door);
        door.setCondition(100);
        closeDoor(closet, door);
        System.out.println(door);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Возраст: %d; Комната: %s", name, age, room);
    }
}
