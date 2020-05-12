/**
 * 
 */
package products.controler;

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
import products.ProductsHelper;
import products.ProductsVO;

/**
 * @author Akash
 *
 */
@WebServlet("/productsselectall")
public class ProductsSelectAll extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 771574158085926385L;


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<ProductsVO> products = new ProductsHelper().getAllProducts();

			//json convertion
			String json = new Gson().toJson(products);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("products", json);

			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
