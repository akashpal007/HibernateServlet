/**
 * 
 */
package orders.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import orders.OrdersHelper;
import orders.OrdersVO;

/**
 * @author Akash
 *
 */
@WebServlet("/ordersselectall")
public class OrdersSelectAll extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = -4598296662027540205L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<OrdersVO> orders = new OrdersHelper().getAllOrders();

			//json convertion
			String json = new Gson().toJson(orders);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("orders", json);

			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
