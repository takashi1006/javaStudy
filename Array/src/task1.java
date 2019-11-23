
public class task1 {

    public static void main(final String[] args) {
        int[] numbers = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
        System.out.print("配列: [");
        for (int i = 0; i < numbers.length; i++ ) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
        int total = 0;
        System.out.print("合計: ");
        for(int number : numbers) {
            total += number;
        }
        System.out.println(total);
    }

}
