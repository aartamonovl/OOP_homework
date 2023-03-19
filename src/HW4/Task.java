package HW4;

import java.util.*;

public class Task{
    private final String id;
    private final String dateCreate;
    private String dateEnd;
    private String idAuthor;
    private String idExecutor;
    private String bodyTask;

    private String priority;

    private static List<Task> taskList = new ArrayList<>();

    public Task(String  dateEnd, String idAuthor, String idExecutor, String bodyTask, String priority) {
        this.id = UUID.randomUUID().toString();
        this.dateCreate = dateNow().toString();
        this.dateEnd = dateEnd;
        this.idAuthor = idAuthor;
        this.idExecutor = idExecutor;
        this.bodyTask = bodyTask;
        this.priority = priority;
        taskList.add(this);
    }
    public Task(String id, String dateCreate, String dateEnd, String idAuthor, String idExecutor, String bodyTask, String priority) {
        this.id = id;
        this.dateCreate = dateCreate;
        this.dateEnd = dateEnd;
        this.idAuthor = idAuthor;
        this.idExecutor = idExecutor;
        this.bodyTask = bodyTask;
        this.priority = priority;
        taskList.add(this);
    }

    private static Date dateNow(){
        return new Date();
    }

    @Override
    public String toString() {
        return String.format("Id: %s\n" +
                "Дата назначения: %s\n" +
                "Дедлайн: %s\n" +
                "Автор: %s\n" +
                "Исполнитель: %s\n" +
                "Задача: %s\n" +
                "Приоритет: %s\n",
                getId(),
                getDateCreate().toString(),
                getDateEnd().toString(),
                fio(getIdAuthor(), "Автор"),
                fio(getIdExecutor(), "Исполнитель"),
                getBodyTask(),
                getPriority());
    }

    private String fio(String id, String who){
        User user;
        if (who.equals("Автор")) {
            user = (User) new Research(User.getList()).spend(getIdAuthor()).get(0);

        } else {
            user = (User) new Research(User.getList()).spend(getIdExecutor()).get(0);
        }
        return String.format("%s: %s %s %s", who, user.getLastName(), user.getName(), user.getMidName());
    }

    public static void showAll() {
        taskList.sort(new SortTaskByPriority());
        for (Task task: taskList){
            System.out.println(task + "\n");
        }
    }

    private String getStrPriority(int priority){
        return Priority.findValue(priority);
    }

    public String getId() {
        return id;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getIdExecutor() {
        return idExecutor;
    }

    public void setIdExecutor(String idExecutor) {
        this.idExecutor = idExecutor;
    }

    public String getBodyTask() {
        return bodyTask;
    }

    public void setBodyTask(String bodyTask) {
        this.bodyTask = bodyTask;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public static void setTaskList(List<Task> taskList) {
        Task.taskList = taskList;
    }

    public static List<Task> getTaskList() {
        return taskList;
    }
}
