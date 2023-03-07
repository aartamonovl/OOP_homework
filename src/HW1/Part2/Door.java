package HW1.Part2;

public class Door {

    private String name;
    private Integer condition;
    private State state;

    public Door(String name, Integer condition) {
        this.name = name;
        this.condition = condition;
        this.state = State.close;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean openDoor(){
        System.out.println("Попробовать открыть дверь.");
        if (this.state == State.close){
            this.state = State.open;
            this.condition -= 5;
            if (this.condition < 80){
                this.creak();
            }
            return true;
        }
        return false;
    }

    public boolean closeDoor(){
        System.out.println("Попробовать закрыть дверь.");
        if (this.state == State.open){
            this.state = State.close;
            this.condition -= 5;
            if (this.condition < 80){
                this.creak();
            }
            return true;
        }
        return false;
    }
    private void creak (){
        System.out.println("Скрип. Смажте дверь.");
    }

    @Override
    public String toString() {
        return String.format("Дверь: %s; Состояние двери: %d; %s", name, condition, state);
    }
}
