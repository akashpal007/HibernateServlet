/**
 * 
 */
package offices.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import offices.OfficesHelper;
import offices.OfficesVO;

/**
 * @author Akash
 *
 */
@WebServlet("/officesselectall")
public class OfficesSelectAll extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8426492433834825473L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<OfficesVO> offices = new OfficesHelper().getAllCustomers();

		//json convertion
		String json = new Gson().toJson(offices);
		
		// customer data is set as a json format
		HttpSession session = req.getSession(false);
		session.setAttribute("offices", json);
		System.out.println(json);
		// Redirected to devtool.jsp
		resp.sendRedirect("devtool.jsp");
		//req.getRequestDispatcher("devtool.jsp").forward(req, resp);
	}
}
