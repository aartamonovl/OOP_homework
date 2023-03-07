package HW1.Part2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Миша", 22, "Зал");
        Closet closet = new Closet("Прихожая", 2, "Шкаф-купе");
        Random r = new Random();
        Door door = closet.getDoorList().get(r.nextInt(closet.getCountDoors() - 1));
        System.out.println(human);
        System.out.println(closet);

        human.doWithDoorCloset(human, closet, door, State.open);
        human.doWithDoorCloset(human, closet, door, State.close);
        human.doWithDoorCloset(human, closet, door, State.open);
        human.doWithDoorCloset(human, closet, door, State.close);
        human.doWithDoorCloset(human, closet, door, State.open);
        human.doWithDoorCloset(human, closet, door, State.close);
        System.out.println(human);
    }
}
