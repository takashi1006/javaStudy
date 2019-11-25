import java.util.Calendar;

public class task7 {

    public static String[] dayOfWeekArray = {
        "日",
        "月",
        "火",
        "水",
        "木",
        "金",
        "土",
    };

    public static void main(final String[] args) {
        Calendar calendar = Calendar.getInstance();
        displayDate(calendar, false);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        displayDate(calendar, false);
        calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR) + 1, calendar.get(Calendar.MONTH), 
                calendar.get(Calendar.DAY_OF_MONTH));
        displayDate(calendar, true);
    }
    
    public static void displayDate(Calendar calendar, boolean displayDayOfWeek) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        if (displayDayOfWeek) {
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println("現在日時： " + year + "年" + month + "月" + day + "日(" + dayOfWeekArray[dayOfWeek - 1] + ")です。");
        } else {
            System.out.println("現在日時： " + year + "年" + month + "月" + day + "日" + "です。");
        }
    } 

}
