package jp.co.techCompass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		Cookie cookies[] = request.getCookies();
		String message;
		int count = 0;
		if (cookies == null || cookies.length == 0) {
			response = this.setCookie(response, "count", 1);
			message = "初めての訪問です。";
			
		} else {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("count")) {
					count = Integer.parseInt(cookie.getValue());
				}
			}
			response = this.setCookie(response, "count", count + 1);
			message = count++ + "回目の訪問です。";
		}
		this.headerHtmlDisplay(out);
		out.println("<h1>訪問回数テスト(クッキー)</h1>");
		out.println("<p>" + message + "</p>");
		out.println("<a href='CountCookie'>画面を再訪問</a>");
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
	private HttpServletResponse setCookie(HttpServletResponse response, String name, int count) {
		Cookie cookie = new Cookie(name, String.valueOf(count));
		cookie.setMaxAge(300);
		response.addCookie(cookie);
		return response;
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
