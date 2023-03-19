package HW4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateDateTimeNow {

    public static Date dateFull(){
        return new Date();
    }

    public static String dateNow() {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        return formatDate.format(date);
    }

    public static String timeNow() {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss");
        return formatDate.format(date);
    }

}
