import java.util.Scanner;

public class task3 {

    public static void main(final String[] args) {
        System.out.println("数字を入力してください");
        final Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();
        System.out.println("桁数" + number.length());
    }

}
