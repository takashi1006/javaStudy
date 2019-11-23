import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        String title = "ノートPCの値段:";
        int price = 89800;
        String unit = "円";
        System.out.println(title + " " + price + unit);
        Scanner scanner = new Scanner(System.in);
        String inputString1 = scanner.nextLine();
        String inputString2 = scanner.nextLine();
        scanner.close();
        System.out.println(inputString1 + inputString2);
    }

}
