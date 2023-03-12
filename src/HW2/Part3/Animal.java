package HW2.Part3;

public abstract class Animal {
    private String nickname;
    private Mood mood;
    private String breed;
    private static String defaultBreed = "Нет породы";

    public Animal(String nickname, Mood mood, String breed){
        this.nickname = nickname;
        this.mood = mood;
        this.breed = breed;
    }

    public Animal(String nickname, Mood mood){
        this(nickname, mood, defaultBreed);
    }
    public Animal(String nickname){
        this(nickname, Mood.well);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s; Настроение: %s; Порода: %s", nickname, mood, breed);
    }
}
