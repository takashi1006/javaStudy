
public class task4 {

	public static void main(String[] args) {
		String sql1 = "delete from employee where name = '削除太郎'";
		String sql2 = "delete from employee where age < 22 or age > 65";
		String sql3 = "delete from employee where birthday >= '2000-04-01'";
		String sql4 = "delete from employee where depart = 2 and salary > 1000";
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
		System.out.println(sql4);
	}

}
