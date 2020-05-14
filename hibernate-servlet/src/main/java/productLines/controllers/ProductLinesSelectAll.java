/**
 * 
 */
package productLines.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import productLines.ProductLinesHelper;
import productLines.ProductLinesVO;

/**
 * @author Akash
 *
 */
@WebServlet("/productlinesselectall")
public class ProductLinesSelectAll extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8447259069867854996L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<ProductLinesVO> productLines = new ProductLinesHelper().getAllProductLines();

			//json convertion
			String json = new Gson().toJson(productLines);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("productLines", json);

			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
