import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/java_study", "root", "root");

			String sql = "select * from employee where age = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 39);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Date birthday = rs.getDate("birthday");
				System.out.println("名前: " + name);
				System.out.println("年齢: " + age);
				System.out.println("生年月日: " + birthday);
			}

			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
