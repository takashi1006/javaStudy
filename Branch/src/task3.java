import java.util.Scanner;

public class task3 {

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		if (number == 0) {
			System.out.println("入力された数字は0です。");
		} else if (number < 0) {
			System.out.println("入力された数字は負の数です。");
		} else {
			System.out.println("入力された数字は正の数です。");
		}
	}

}
