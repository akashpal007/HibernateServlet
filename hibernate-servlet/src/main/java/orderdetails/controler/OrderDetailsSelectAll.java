/**
 * 
 */
package orderdetails.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import orderdetails.OrderDetailsVO;
import orderdetails.OrderdetailsHelper;

/**
 * @author Akash
 *
 */
@WebServlet("/orderdetailsselectall")
public class OrderDetailsSelectAll extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3209423031821648359L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<OrderDetailsVO> orderDetails = new OrderdetailsHelper().getAllOrderdetails();

			//json convertion
			String json = new Gson().toJson(orderDetails);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("orderDetails", json);

			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
