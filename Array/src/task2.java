
public class task2 {

    public static void main(final String[] args) {
        int[] numbers = new int[7];
        int number = numbers.length;
        System.out.print("配列: [");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number;
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(number);
            number--;
        }
        System.out.println("]");
        System.out.print("配列(逆順): [");
        for (int i = numbers.length -1; i >= 0; i-- ) {
            if (i != numbers.length -1) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
    }

}
