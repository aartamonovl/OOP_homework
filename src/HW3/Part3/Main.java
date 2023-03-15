package HW3.Part3;
public class Main {
    public static void main(String[] args) {
        Owner firstOwner = new Owner("Наташа", Mood.sad, true, 25);
        Owner secondOwner = new Owner("Андрей", Mood.well, false, 26);

        System.out.println(firstOwner);
        System.out.println(secondOwner);
        System.out.println(firstOwner.compareTo(secondOwner));

        Dog firstDog = new Dog("Бэся", Mood.angry, "Такса", 20);
        Dog secondDog = new Dog("Бэся", Mood.angry, "Овчарка", 20);
        System.out.println(firstDog.equals(secondDog));
        System.out.println(firstOwner);
        System.out.println(firstDog);
        System.out.println(secondDog);
        firstOwner.scratchAnimal(secondDog);

        if (!secondOwner.isYummy()){
            secondDog.gotBite(secondOwner);
        }

        firstOwner.speak();
        firstDog.changeMood(firstOwner.getMood(), firstOwner.isYummy());
        firstDog.moveTo();
        firstOwner.changeMood(firstDog.getMood());

        System.out.println(firstOwner);
        System.out.println(firstDog);
    }
}