import java.util.ArrayList;

public class task2 {

    public static void main(final String[] args) {
        int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] % 2 == 0) {
                evenNumbers.add(numbers[i]);
            } else {
                oddNumbers.add(numbers[i]);
            }
        }
        System.out.print("偶数の配列: ");
        System.out.println(evenNumbers);
        System.out.print("奇数の配列: ");
        System.out.println(oddNumbers);
    }

}
