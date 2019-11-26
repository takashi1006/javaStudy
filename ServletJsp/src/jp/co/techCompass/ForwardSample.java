package jp.co.techCompass;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardSample
 */
@WebServlet("/ForwardSample")
public class ForwardSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String resultPath = "/WEB-INF/jsp/sample.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		Random random = new Random();
		int number = random.nextInt(10);
		SampleBean sampleData = new SampleBean();
		sampleData.setDate(date);
		sampleData.setLuckyNumber(number);
		request.setAttribute("SAMPLE", sampleData);
		request.getRequestDispatcher(ForwardSample.resultPath).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
