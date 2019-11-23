
public class task3 {

    public static void main(final String[] args) {
        int length = 8;
        int height = 7;
        double area = calcArea(length, height);
        System.out.println("高さが" + height + "cm,底辺が" + length + "cmの面積は" + area + "cm2です！");
    }

    public static double calcArea(int length, int height) {
        double area = length * height / 2;
        return Math.round(area);
    } 

}
