/**
 * 
 */
package employees.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import employees.EmployeesHelper;
import employees.EmployeesVO;

/**
 * @author Akash
 *
 */
@WebServlet("/employeesselectall")
public class EmployeesSelectAll extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7765379661581357165L;

	/**
	 * 
	 */

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<EmployeesVO> employees;

		try {
			employees = new EmployeesHelper().getAllEmployees();
			
			//json convertion
			String json = new Gson().toJson(employees);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("employees", json);

			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
