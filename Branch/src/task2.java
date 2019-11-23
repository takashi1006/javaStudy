import java.util.Scanner;

public class task2 {

    public static void main(final String[] args) {
        System.out.println("10以上の数字を入力してください");
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number < 10) {
            System.out.println("値： 0" + number);
        } else {
            System.out.println("値： " + number);
        }
    }

}
