import java.util.Scanner;

public class task4 {

    public static void main(final String[] args) {
        System.out.println("正の整数を入力してください");
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.print(number + "の約数: ");
        for (int i = 1; i <= number; i++ ) {
            if (number % i == 0) {
                if (i != 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }
    }

}
