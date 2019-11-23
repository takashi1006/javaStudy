
public class task5 {

    public static void main(final String[] args) {
        System.out.println("九九");
        int total = 0;
        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1; j <= 9; j++) {
                total = i * j;
                if (j != 1) {
                    if (total < 10) {
                        System.out.print("  ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(total);
            }
            System.out.println("");
        }
    }

}
