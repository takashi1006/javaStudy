

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Date;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String message = "";
	private Connection conn = null;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		this.headerHtmlDisplay(out);
		out.println("<p>" + Register.message + "</p>");
		try {
			conn = this.getConnection();

			String sql = "select * from employee";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Date birthday = rs.getDate("birthday");
				out.println("<p>ID: " + id + "</p>");
				out.println("<p>名前: " + name + "</p>");
				out.println("<p>年齢: " + age + "</p>");
				out.println("<p>生年月日: " + birthday + "</p>");
			}

			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
					this.conn = null;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		this.footerHtmlDisplay(out);
	}

	/**
	 * 
	 */
	private void headerHtmlDisplay(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"ja\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>servlet</title>");
		out.println("</head>");
		out.println("<body>");
	}

	/**
	 * 
	 */
	private void footerHtmlDisplay(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = null;
		try {
			conn = this.getConnection();

			String sql = "insert into employee values (?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, request.getParameter("id"));
			ps.setString(2, request.getParameter("name"));
			ps.setString(3, request.getParameter("birthday"));
			ps.setString(4, request.getParameter("age"));

			int rs = ps.executeUpdate();

			if (rs == 0) {
				Register.message = "登録に失敗しました！";
			} else {
				Register.message = "登録に成功しました！";
			}

			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		doGet(request, response);
	}

	/**
	 * 
	 */
	private Connection getConnection() {
		if (this.conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/java_study", "root", "root");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return this.conn;
	}

}
