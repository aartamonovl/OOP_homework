package HW3.Part3;
public class Owner implements Say, Comparable<Owner>{
    private String name;
    private Mood mood;
    private boolean yummy;
    private int age;
    private static int defaultAge = 18;

    public Owner(String name, Mood mood, boolean yummy, int age){
        this.name = name;
        this.mood = mood;
        this.yummy = yummy;
        this.age = age;
    }

    public Owner(String name, Mood mood){
        this(name, mood, false, defaultAge);
    }
    public Owner(String name){
        this(name, Mood.well);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public boolean isYummy() {
        return yummy;
    }

    public void setYummy(boolean yummy) {
        this.yummy = yummy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void changeMood(Mood moodDog){
        if (moodDog == Mood.well || moodDog == Mood.playful){
            this.mood = Mood.well;
        }
    }

    public void kick(Dog dog){
        System.out.println("Пнул");
        dog.setMood(Mood.sad);
    }

    public void scratchAnimal(Animal animal){
        this.speak();
        if (!animal.answer()){
            this.setMood(Mood.sad);
        } else{
            System.out.println("Чешит.");
        }
    }

    @Override
    public int compareTo(Owner owner){
        return this.getAge() - owner.getAge();
    }

    @Override
    public void speak() {
        switch (this.mood){
            case well:
                System.out.println("Где моя хорошая девочка?");
                break;
            case sad:
                System.out.println("Подойди ко мне.");
                break;
            case angry:
                System.out.println("А ну быстро ко мне!");
                break;
            default:
                System.out.println("Молча входит.");
        }
        if (this.yummy){
            System.out.println("У меня для тебя вкусняшка))");
        }
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Настроение: %s", name, mood);
    }
}