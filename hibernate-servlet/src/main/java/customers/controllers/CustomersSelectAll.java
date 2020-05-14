/**
 * 
 */
package customers.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import customers.CustomersHelper;
import customers.CustomersVO;

/**
 * @author akash throws IOException
 */
@WebServlet("/customersselectall")
public class CustomersSelectAll extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2629199305664125677L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {

		ArrayList<CustomersVO> customers;
		try {
			customers = new CustomersHelper().getAllCustomers();
			
			//json convertion
			String json = new Gson().toJson(customers);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("customers", json);
			
			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
