
public class task3 {

	public static void main(String[] args) {
		String sql1 = "insert into employee (name, birthday, age, depart, salary) values ('社員太郎', '1990-01-01', 29, 1, 450)";
		String sql2 = "insert into employee (name, birthday, age, salary) values ('社員花子', '1980-02-01', 39, 550)";
		System.out.println(sql1);
		System.out.println(sql2);
	}

}
