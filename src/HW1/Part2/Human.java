package HW1.Part2;

public class Human {
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

    public void doWithDoorCloset(Human human, Closet closet, Door door, State state){
        if (human.room.equals(closet.getRoom())){
            System.out.println("Подойти к шкафу.");
        } else {
            System.out.println("Зайти в комнату, где стоит шкаф и подойти к шкафу.");
            human.room = closet.getRoom();
        }
        switch (state){
            case open:
                if (door.openDoor()){
                    System.out.println("Дверь открыта.");
                } else {
                    System.out.println("Дверь уже открыта");
                }
                break;
            case close:
                if (door.closeDoor()){
                    System.out.println("Дверь закрыта.");
                } else {
                    System.out.println("Дверь уже закрыта.");
                }
                break;
        }
        System.out.println(door);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Возраст: %d; Комната: %s", name, age, room);
    }
}
