package HW1.Part3;

import HW1.Part2.Door;

public class Dog {
    private String nickname;
    private Mood mood;
    private String breed;
    private static String defaultBreed = "Дворняжка";

    public Dog(String nickname, Mood mood, String breed){
        this.nickname = nickname;
        this.mood = mood;
        this.breed = breed;
    }
    public Dog(String nickname, Mood mood){
        this(nickname, mood, defaultBreed);
    }
    public Dog(String nickname){
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

    public Mood answerToCallOwner(Mood moodOwner, boolean yummy, Dog dog){
        if (moodOwner == Mood.angry){
            dog.mood = Mood.sad;
        }
        if (yummy){
            dog.mood = Mood.playful;
        }
        return moveToOwner();
    }

    public Mood moveToOwner(){
        Mood mood = this.mood;
        switch (mood){
            case well:
                System.out.println("Несется из другой комнаты и виляет хвостом.");
                break;
            case sad:
                System.out.println("Медленно подходит и ложится в ногах.");
                break;
            case angry:
                System.out.println("Недовольно рычит.");
                break;
            case playful:
                System.out.println("Неожиданно прыгает из-за угла.");
                break;
            default:
                System.out.println("Нет реакции.");
                break;
        }
        return mood;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s; Настроение: %s; Порода: %s", nickname, mood, breed);
    }
}
