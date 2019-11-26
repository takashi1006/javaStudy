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
 * Servlet implementation class task4
 */
@WebServlet("/task4")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String resultPath = "/WEB-INF/jsp/fortuneResult.jsp";
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
		Date date = new Date();
		Random random = new Random();
		FortuneBean fortuneBean = new FortuneBean();
		fortuneBean.setToday(date);
		fortuneBean.setFortune(fortuneResult[random.nextInt(6)]);
		request.setAttribute("fortuneBean", fortuneBean);
		request.getRequestDispatcher(task4.resultPath).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
