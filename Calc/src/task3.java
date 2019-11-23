import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();
        int total = number1 + number2 + number3;
        double intAverage = total / 3;
        double doubleAverage = total / 3.0;
        System.out.println("合計： " + total);
        System.out.println("平均(3で割ったとき)： " + intAverage);
        System.out.println("平均(3.0で割ったとき)： " + doubleAverage);
    }

}
