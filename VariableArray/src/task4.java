import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

    public static void main(final String[] args) {
        int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] % 2 == 0) {
                evenNumbers.add(numbers[i]);
            } else {
                oddNumbers.add(numbers[i]);
            }
        }
        numberMap.put("偶数", evenNumbers);
        numberMap.put("奇数", oddNumbers);
        System.out.println(numberMap);
    }

}
