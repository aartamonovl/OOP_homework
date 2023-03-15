package HW3.Part3;
public abstract class Animal implements Say, Move{
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


    public boolean answer(){
        this.speak();
        if (!this.moveTo()){
            return false;
        }
        if (this.getMood() == Mood.playful){
            this.lieBack();
        }
        return true;
    }

    @Override
    public boolean moveTo(){
        this.speak();
        if (this.getMood() != Mood.sad){
            System.out.println("Мчу-лечу");
            return true;
        } else {
            System.out.println("Нет реакции.");
            return false;
        }
    }

    @Override
    public void leave(){
        System.out.println("Ухожу");
    }
    @Override
    public void lieBack(){
        System.out.println("Лег на спину.");
    }
}