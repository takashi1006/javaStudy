import java.util.Scanner;

public class task7 {

	public static void main(final String[] args) {
		final String MONDAY = "月曜";
		final String TUESDAY = "火曜";
		final String WEDNESDAY = "水曜";
		final String THURSDAY = "木曜";
		final String FRIDAY = "金曜";
		final String SATURDAY = "土曜";
		final String SUNDAY = "日曜";
		System.out.println("病院に行く曜日を選択してください。");
		System.out.println(
			"[" +
			 SUNDAY + ", " +
			 MONDAY + ", " +
			 TUESDAY + ", " +
			 WEDNESDAY + ", " +
			 THURSDAY + ", " +
			 FRIDAY + ", " +
			 SATURDAY + ", " +
			"]"
		);
		final Scanner scanner = new Scanner(System.in);
		String selectDay = scanner.nextLine();
		scanner.close();
		String message;
		switch (selectDay) {
			case MONDAY:
				message = "午前診療と午後診療があります";
				break;
			case TUESDAY:
				message = "午前診療と午後診療があります";
				break;
			case WEDNESDAY:
				message = "午前診療と午後診療があります";
				break;
			case THURSDAY:
				message = "午前診療と午後診療があります";
				break;
			case FRIDAY:
				message = "午前診療と午後診療があります";
				break;
			case SATURDAY:
				message = SATURDAY + "は午後診療のみです";
				break;
			case SUNDAY:
				message = SUNDAY + "は休診です";
				break;
			default:
				message = "入力を確認してください";
				break;
		}
		System.out.println(message);
	}

}
