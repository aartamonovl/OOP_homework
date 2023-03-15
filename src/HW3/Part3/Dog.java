package HW3.Part3;
public class Dog extends Animal{
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
                System.out.println("Гав-гав-гав-гав!");
                break;
            case sad:
                System.out.println("Нет реакции.");
                break;
            case angry:
                System.out.println("РРРРРР!");
                break;
            case playful:
                System.out.println("....... ГАВ!");
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

    public void gotBite(Owner owner){
        System.out.println("Укусил");
        owner.setMood(Mood.angry);
    }

    @Override
    public String toString() {
        return String.format("%s; Выстота: %d", super.toString(), height);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        } else if (this.getClass() != obj.getClass()){
            return false;
        } else return this.getHeight() == (((Dog)obj).getHeight());
    }

}