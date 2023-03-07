package HW1.Part3;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Наташа", Mood.sad, true);
        Dog dog = new Dog("Бэся", Mood.angry, "Такса");
        System.out.println(owner);
        System.out.println(dog);
        owner.callDog(dog, owner);
        System.out.println(owner);
        System.out.println(dog);
    }
}
