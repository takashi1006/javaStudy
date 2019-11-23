
public class task1 {

	public static void main(String[] args) {
        int beforeCalc = 3 + 2 * 6 + 5;
        int afterCalc = ((3 + 2) * 6) + 5;
        int calcAnswer = 24 % 3;
        System.out.println("修正前： " + beforeCalc);
        System.out.println("修正後： " + afterCalc);
        System.out.println("24/3の余り： " + calcAnswer);
	}

}
