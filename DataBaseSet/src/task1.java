
public class task1 {

	public static void main(String[] args) {
		String sql1 = "CREATE TABLE `employee` (" +
			"`id` bigint(20) unsigned," +
			"`name` varchar(16) DEFAULT NULL COMMENT '名前'," +
			"`birthday` date NULL DEFAULT NULL COMMENT '生年月日'," +
			"`age` tinyint(3) unsigned DEFAULT NULL COMMENT '年齢'," +
			"PRIMARY KEY (`id`)" +
			") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
		String sql2 = "insert into employee values (1, '田中太郎', '1990-01-01', 29);";
		String sql3 = "insert into employee values (2, '山田花子', '1980-05-01', 39);";
		String sql4 = "select * from employee;";
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
		System.out.println(sql4);
	}

}
