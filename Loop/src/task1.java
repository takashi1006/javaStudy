import java.util.Scanner;

public class task1 {

    public static void main(final String[] args) {
        System.out.println("数字を入力してください");
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int total = 0;
        for (int i = 1; i <= number; i++ ) {
            total += i;
        }
        System.out.println("1~" + number + "までの合計: " + total);
    }

}
