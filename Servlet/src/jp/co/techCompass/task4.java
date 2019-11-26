package jp.co.techCompass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class task4
 */
@WebServlet("/task4")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String[] fortuneResult = {
		"大吉",
		"中吉",
		"小吉",
		"末吉",
		"凶",
		"大凶",
	}; 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		Random random = new Random();
		PrintWriter out = response.getWriter();
		this.headerHtmlDisplay(out);
		out.println("<p>↓占い結果↓</p>");
		out.println("<h1>" + fortuneResult[random.nextInt(6)] + "</h1>");
		this.footerHtmlDisplay(out);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
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

}
