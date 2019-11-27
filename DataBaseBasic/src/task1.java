
public class task1 {

	public static void main(String[] args) {
		String allDataGetSql = "select * from employee";
		String includeStringSql = "select * from employee where name like '%太%'";
		String after1990Sql = "select * from employee where date >= '1990-01-01'";
		String after60AndSalesSql = "select * from employee where age >= 60 and depart = 1";
		String before30OrDevelopSql = "select * from employee where age <= 30 or depart = 2";
		System.out.println(allDataGetSql);
		System.out.println(includeStringSql);
		System.out.println(after1990Sql);
		System.out.println(after60AndSalesSql);
		System.out.println(before30OrDevelopSql);
	}

}
