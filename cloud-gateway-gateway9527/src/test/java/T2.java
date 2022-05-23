import java.time.ZonedDateTime;

/**
 * @author hugh
 * @create 2022-05-03 16:10
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();    // 默认时区
        System.out.println(zbj);
    }
}
