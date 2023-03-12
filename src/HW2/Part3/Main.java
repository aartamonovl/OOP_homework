package HW2.Part3;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Наташа", Mood.sad, true);
        Dog dog = new Dog("Бэся", Mood.angry, "Такса", 20);

        System.out.println(owner);
        System.out.println(dog);

        owner.speak();
        dog.changeMood(owner.getMood(), owner.isYummy());
        dog.speak();
        owner.changeMood(dog.getMood());

        System.out.println(owner);
        System.out.println(dog);
    }
}
