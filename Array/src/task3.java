import java.util.Random;

public class task3 {

    public static void main(final String[] args) {
        int[] numbers = new int[6];
        System.out.print("配列: [");
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            int number = random.nextInt(9);
            numbers[i] = number;
            if (i != 0) {
                System.out.print(", ");
                if (max < number) {
                    max = number;
                }
                if (min > number) {
                    min = number;
                }
            } else {
                max = number;
                min = number;
            }
            System.out.print(number);
        }
        System.out.println("]");
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }

}
