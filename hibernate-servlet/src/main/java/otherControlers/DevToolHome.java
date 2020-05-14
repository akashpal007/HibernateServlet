package otherControlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import customers.CustomersHelper;
import customers.CustomersVO;
import employees.EmployeesHelper;
import employees.EmployeesVO;
import offices.OfficesHelper;
import offices.OfficesVO;
import orderdetails.OrderDetailsVO;
import orderdetails.OrderdetailsHelper;
import orders.OrdersHelper;
import orders.OrdersVO;
import payments.PaymentsHelper;
import payments.PaymentsVO;
import productLines.ProductLinesHelper;
import productLines.ProductLinesVO;
import products.ProductsHelper;
import products.ProductsVO;
/**
 * @author Akash
 *
 */
@WebServlet("/DevToolHome")
public class DevToolHome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6159215665425111144L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<CustomersVO> customers = new CustomersHelper().getFirstFiveCustomers();
			List<EmployeesVO> employees = new EmployeesHelper().getFirstFiveEmployees();
			List<OfficesVO> offices = new OfficesHelper().getFirstFiveCustomers();
			List<OrdersVO> orders = new OrdersHelper().getFirstFiveOrders();
			
			List<OrderDetailsVO> orderDetails = new OrderdetailsHelper().getFirstFiveOrderdetails();
			List<ProductsVO> products = new ProductsHelper().getFirstFiveProducts();
			List<ProductLinesVO> productLines = new ProductLinesHelper().getFirstFiveProductLines();
			List<PaymentsVO> payments = new PaymentsHelper().getFirstFivePayments();

			//json convertion
			String customersList = new Gson().toJson(customers);
			String employeesList = new Gson().toJson(employees);
			String officesList = new Gson().toJson(offices);
			String ordersList = new Gson().toJson(orders);
			
			String orderDetailsList = new Gson().toJson(orderDetails);
			String productsList = new Gson().toJson(products);
			String productLinesList = new Gson().toJson(productLines);
			String paymentsList = new Gson().toJson(payments);
			
			// set customer data in session attribute
			HttpSession session = req.getSession();
			session.setAttribute("customers", customersList);
			session.setAttribute("orders", ordersList);
			session.setAttribute("offices", officesList);
			session.setAttribute("employees", employeesList);
			
			session.setAttribute("orderDetails", orderDetailsList);
			session.setAttribute("products", productsList);
			session.setAttribute("productLines", productLinesList);
			session.setAttribute("payments", paymentsList);
			
			// Redirected to devtool.jsp
			resp.sendRedirect("devtool.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
