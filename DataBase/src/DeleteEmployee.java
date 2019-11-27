

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
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn = null;
	private String message = "";
	private String deleteId = "";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		this.headerHtmlDisplay(out);
		out.println("<p>" + this.message + "</p>");
		out.println("<a href='select.html'>検索画面に戻る</a>");
		out.println("<a href='update.html'>更新画面に戻る</a>");
		out.println("<a href='delete.html'>削除画面に戻る</a>");
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = null;
		try {
			conn = this.getConnection();

			this.deleteId = request.getParameter("id");
			String sql = "delete from employee where id = "
					+ this.deleteId;
			PreparedStatement ps = conn.prepareStatement(sql);

			int rs = ps.executeUpdate();

			if (rs == 0) {
				this.message = this.deleteId + "の削除に失敗しました！";
			} else {
				this.message = this.deleteId + "の削除に成功しました！";
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
