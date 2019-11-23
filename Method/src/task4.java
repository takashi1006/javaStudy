
public class task4 {

    public static void main(final String[] args) {
        int inputInt1 = 2;
        int inputInt2 = 6;
        String inputString1 = "tech";
        String inputString2 = " Compass";
        double inputDouble1 = 5.3;
        double inputDouble2 = 8.9;
        int messageInt = overload(inputInt1, inputInt2);
        System.out.println(messageInt);
        String messageString = overload(inputString1, inputString2);
        System.out.println(messageString);
        double messageDouble = overload(inputDouble1, inputDouble2);
        System.out.println(messageDouble);
    }

    public static int overload(int number1, int number2) {
        return number1 + number2;
    } 

    public static String overload(String string1, String string2) {
        return string1 + string2;
    } 

    public static double overload(double number1, double number2) {
        return number1 + number2;
    } 

}
