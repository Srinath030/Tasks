import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Darendtime {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();

        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String update=now.format(format);
        System.out.println("Date nd time is :" +" "+ update);
    }
}
