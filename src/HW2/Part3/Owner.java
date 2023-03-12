package HW2.Part3;

public class Owner implements Say{
    private String name;
    private Mood mood;
    private boolean yummy;

    public Owner(String name, Mood mood, boolean yummy){
        this.name = name;
        this.mood = mood;
        this.yummy = yummy;
    }

    public Owner(String name, Mood mood){
        this(name, mood, false);
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

    public void changeMood(Mood moodDog){
        if (moodDog == Mood.well || moodDog == Mood.playful){
            this.mood = Mood.well;
        }
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
