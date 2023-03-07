package HW1.Part3;

import java.sql.SQLOutput;

public class Owner {
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

    public void callDog(Dog dog, Owner owner){
        switch (owner.mood){
            case well:
                System.out.println("Где мой хороший мальчик?");
                break;
            case sad:
                System.out.println(String.format("%s, подойди ко мне.", dog.getNickname()));
                break;
            case angry:
                System.out.println("А ну быстро ко мне!");
                break;
        }
        Mood moodDog = dog.answerToCallOwner(owner.mood, yummy, dog);
        if (moodDog == Mood.well || moodDog == Mood.playful){
            this.mood = Mood.well;
        }
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Настроение: %s", name, mood);
    }
}
