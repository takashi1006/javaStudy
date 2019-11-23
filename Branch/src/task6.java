import java.util.Scanner;

public class task6 {

	public static void main(final String[] args) {
		System.out.println("1~5までの数字を入力してください。");
		final Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		String message;
		switch (number) {
			case 1:
				message = number + " -> Ⅰ";
				break;
			case 2:
				message = number + " -> Ⅱ";
				break;
			case 3:
				message = number + " -> Ⅲ";
				break;
			case 4:
				message = number + " -> Ⅳ";
				break;
			case 5:
				message = number + " -> Ⅴ";
				break;
			default:
				message = number + " -> unknown";
				break;
		}
		System.out.println(message);
	}

}
