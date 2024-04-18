package com.quizz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class checkCredentials
 */
@WebServlet("/checkCredentials")
public class checkCredentials extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean isOk;

	public static boolean checkProperty(String userName, String password) {
		String LOCATIONprop = "C://Users/Jeffreymedwin.POINTEL/eclipse-workspace/QuizzApplication/src/main/webapp/credentials.properties";
		File file = new File(LOCATIONprop);
		try {
			FileInputStream fileInput = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fileInput);

			@SuppressWarnings("rawtypes")
			Enumeration enuKeys = props.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = props.getProperty(key);

				if ((key.equals(userName)) && (value.equals(password))) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		String userName;
		String password;
		PrintWriter out = response.getWriter();
		;

		userName = request.getParameter("username");
		password = request.getParameter("password");

		isOk = checkProperty(userName, password);

		if (!isOk) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('User or password incorrect');");
			out.println("location='index.jsp';");
			out.println("</script>");

		} else {
			out.print(isOk);
		}
	}
}