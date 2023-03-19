package HW4;

public class Main {
    public static void main(String[] args) {
        Priority.createDict();
        User.createStartUsers();
        Import.importCSV();
        Task.showAll();
//        Task task1 =  new Task(Inputs.dateEnd(), "0", "1", "DoSmth", "1");
//        Task task2 =  new Task(Inputs.dateEnd(), "2", "0", "DoSmth2", "2");
//        Task task3 =  new Task(Inputs.dateEnd(), "1", "1", "DoSmth3", "0");
//        Task task4 =  new Task(Inputs.dateEnd(), "1", "0", "DoSmth3", "2");
//        Export.exportCSV();
//        System.out.println(Task.getTaskList());
//        Task.showAll();

    }
}
