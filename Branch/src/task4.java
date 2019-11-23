import java.util.Scanner;

public class task4 {

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		scanner.close();
		System.out.println("numA: " + numA);
		System.out.println("numB: " + numB);
		if (numA <= 0 || numB <= 0) {
			System.out.println("正の整数を入力して下さい。");
		} else if (numA % numB == 0) {
			System.out.println("numBはnumAの約数です。");
		} else {
			System.out.println("numBはnumAの約数ではありません。");
		}
	}

}
