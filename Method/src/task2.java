import java.text.SimpleDateFormat;
import java.util.Date;

public class task2 {

    public static void main(final String[] args) {
        String name = "テスト ホゲ";
        int age = 36;
        double height = 171.3;
        displayPersonal(name, age, height, new Date());
    }

    public static void displayPersonal(String name, int age, double height, Date today) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("今日は" + df.format(today) + "です。");
        System.out.println("私の名前は" + name + "です。");
        System.out.println("年齢は" + age + "才です。");
        System.out.println("身長は" + height + "cmです。");
    } 

}
