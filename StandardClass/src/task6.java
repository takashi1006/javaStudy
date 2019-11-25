import java.text.SimpleDateFormat;
import java.util.Date;

public class task6 {

    public static void main(final String[] args) {
    	Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("今は" + df.format(today) + "です。");
        df = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
        System.out.println("今は" + df.format(today) + "です。");
    }

}
