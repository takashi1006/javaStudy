
public class task2 {

	public static void main(String[] args) {
		String sql1 = "update employee set age = 29 where name = '社員太郎'";
		String sql2 = "update employee set salary = 600 where age >= 35 and depart = 2";
		String sql3 = "update employee set depart = 1 where age >= 25 and age <= 30";
		String sql4 = "update employee set birthday = '1999-01-01' where name like '青%' or name like '%赤'";
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
		System.out.println(sql4);
	}

}
