
public class task2 {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 12;
        int number3 = 13;
        int total = number1 + number2 + number3;
        int intAverage = total / 3;
        double doubleAverage = total / 3.0;
        System.out.println("合計： " + total);
        System.out.println("平均(3で割ったとき)： " + intAverage);
        System.out.println("平均(3.0で割ったとき)： " + doubleAverage);
    }

}
