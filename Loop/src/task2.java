import java.util.Scanner;

public class task2 {

    public static void main(final String[] args) {
        System.out.println("数字を入力してください");
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int total = 0;
        for (int i = 1; i <= number; i++ ) {
            if (i != 1) {
                System.out.print(" + ");
            }
            total += i;
            System.out.print(i);
        }
        System.out.println(" = " + total);
    }

}
