/**
 * 
 */
package payments.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import payments.PaymentsHelper;
import payments.PaymentsVO;

/**
 * @author Akash
 *
 */
@WebServlet("/paymentsselectall")
public class PaymentsSelectAll extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4330057312399496821L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<PaymentsVO> payments = new PaymentsHelper().getAllPayments();

			// json convertion
			String json = new Gson().toJson(payments);

			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("payments", json);

			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
