package jp.co.techCompass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HtmlTemplate
 */
@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		this.headerHtmlDisplay(out);
		out.println("<p>Hello Servlet!</p>");
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
