package HW1.Part1;

public class Person {
    private String fullName;
    private static String defaultFullName = "None_";
    private Gender gender;
    private static Gender defaultGender = Gender.man;
    private static Integer countNone = 0;

    public Person(String fullName, Gender gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public Person(String fullName) {
        this(fullName, defaultGender);
    }

    public Person() {
        this(String.format("%s%d", defaultFullName, ++countNone));
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
