package HW2.Part2;

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
        creak(this.condition);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private void creak (int cond){
        if (cond < 10){
            System.out.println("Дверь не открывается");
        } else if (cond < 40){
            System.out.println("Сильный скрип");
        } else if (cond < 80){
            System.out.println("Слабый скрип");
        }
    }

    @Override
    public String toString() {
        return String.format("Дверь: %s; Состояние двери: %d; %s", name, condition, state);
    }
}
