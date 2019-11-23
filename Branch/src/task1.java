import java.util.Scanner;

public class task1 {

    public static void main(final String[] args) {
        System.out.println("10以上の数字を入力してください");
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number < 10) {
            number *= 10;
        }
        System.out.println("値： " + number);
    }

}
