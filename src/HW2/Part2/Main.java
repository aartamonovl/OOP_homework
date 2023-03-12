package HW2.Part2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Миша", 22, "Зал");
        Closet closet = new Closet("Прихожая", 2, "Шкаф-купе");
        Random r = new Random();
        Door door = closet.getDoorList().get(r.nextInt(closet.getCountDoors() - 1));
        System.out.println(human);
        System.out.println(closet);

        human.openDoor(closet, door);
        human.closeDoor(closet, door);
        human.openDoor(closet, door);
        human.closeDoor(closet, door);
        human.openDoor(closet, door);
        human.closeDoor(closet, door);
        human.greaseDoor(closet, door);
        System.out.println(human);
    }
}
