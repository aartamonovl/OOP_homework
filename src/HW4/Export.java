package HW4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Export {
    public static void exportCSV(){
        try {
            PrintWriter writer = new PrintWriter(new File("test.csv"));
            StringBuilder sb = new StringBuilder();
            for (Task task: Task.getTaskList()){
                sb.append(task.getId());
                sb.append(";");
                sb.append(task.getDateCreate());
                sb.append(";");
                sb.append(task.getDateEnd());
                sb.append(";");
                sb.append(task.getIdAuthor());
                sb.append(";");
                sb.append(task.getIdExecutor());
                sb.append(";");
                sb.append(task.getBodyTask());
                sb.append(";");
                sb.append(task.getPriority());
                sb.append("\n");
            }
            writer.write(sb.toString());
            writer.close();
            System.out.println("Готово");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
