package HW2.Part2;

public abstract class Stuff {
    private String room;
    private String type;

    public Stuff(String room, String type) {
        this.room = room;
        this.type = type;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Комната: %s; Тип: %s", room, type);
    }
}
