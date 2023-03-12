package HW2.Part3;

public class Dog extends Animal implements Say{
    private int height;
    private static int defaultHeight = 25;

    public Dog(String nickname, Mood mood, String breed, int height){
        super(nickname, mood, breed);
        this.height = height;
    }
    public Dog(String nickname, Mood mood, String breed){
        super(nickname, mood, breed);
        this.height = defaultHeight;
    }
    public Dog(String nickname, Mood mood){
        super(nickname, mood);
        this.height = defaultHeight;
    }

    public Dog(String nickname){
        super(nickname);
        this.height = defaultHeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void speak() {
        switch (super.getMood()){
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
    }
    public Mood changeMood(Mood moodOwner, boolean yummy){
        if (moodOwner == Mood.angry){
            super.setMood(Mood.sad);
        }
        if (yummy){
            super.setMood(Mood.playful);
        }
        return super.getMood();
    }

    @Override
    public String toString() {
        return String.format("%s; Выстота: %d", super.toString(), height);
    }
}
