package jp.co.techCompass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterSession
 */
@WebServlet("/CounterSession")
public class CounterSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String message;
		String value = (String)session.getAttribute("count");
		int count = 1;
		if (value == null) {
			session.setAttribute("count", String.valueOf(count));
			message = "初めての訪問です。";

		} else {
			count = Integer.parseInt(value);
			session.setAttribute("count", String.valueOf(count + 1));
			message = count++ + "回目の訪問です。";
		}
		this.headerHtmlDisplay(out);
		out.println("<h1>訪問回数テスト(セッション)</h1>");
		out.println("<p>" + message + "</p>");
		out.println("<a href='CounterSession'>画面を再訪問</a>");
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
