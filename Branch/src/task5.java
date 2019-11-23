import java.util.Scanner;

public class task5 {

	public static void main(final String[] args) {
		int highNum;
		final Scanner scanner = new Scanner(System.in);
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		if (numA < numB) {
			highNum = numB;
		} else {
			highNum = numA;
		}
		int numC = scanner.nextInt();
		scanner.close();
		System.out.println("numA: " + numA);
		System.out.println("numB: " + numB);
		System.out.println("numC: " + numC);
		if (highNum < numC) {
			System.out.println("最大値: " + numC);
		} else {
			System.out.println("最大値: " + highNum);
		}
	}

}
