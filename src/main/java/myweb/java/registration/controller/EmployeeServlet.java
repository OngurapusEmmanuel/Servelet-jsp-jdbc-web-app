package myweb.java.registration.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myweb.java.registration.dao.EmployeeDao;
import myweb.java.registration.model.Employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet(value={"/register"})
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmployeeDao employeeDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
//        super();
//        // TODO Auto-generated constructor stub
    	
    	this.employeeDao=new EmployeeDao();
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	jakarta.servlet.RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/views/EmployeeRegister.jsp");
			dispatcher.forward(request,response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		String phone=request.getParameter("phone");
		String password=request.getParameter("password");
		
		
	Employee employee=new Employee( name, email, age, phone, password);
		employee.setName(name);
		employee.setEmail(email);
		employee.setAge(age);
		employee.setPhone(phone);
		employee.setPassword(password);
		
	try {
			employeeDao.registerEmployee(employee);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	jakarta.servlet.RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/views/NewFile.jsp");
	dispatcher.forward(request,response);
	}
}

		
//		String action=request.getServletPath();
//		
//		switch(action) {
//		case("/new"):
//			showViewForm(request,response);
//			break;
//		case("/update"):
//			try {
//				updateEmployee(request, response);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		case("/insert"):
//			try {
//				insertEmployee(request, response);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		case("/delete"):
//			try {
//				deleteEmployee(request, response);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		case("/edit"):
//			try {
//				showEditForm(request, response);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ServletException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		default:
//			try {
//				listEmployee(request, response);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ServletException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		}
//		
//	}
//	private void showViewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		jakarta.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/EmployeeRegister.jsp");
//		dispatcher.forward(request,response);
//	}
//	private void listEmployee(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException, ClassNotFoundException {
//		List<Employee> listEmployee=EmployeeDao.selectAllEmployees();
//		request.setAttribute("listEmployee", listEmployee);
//		jakarta.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/EmployeeRegister.jsp");
//	}
//	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException {
//		int id=Integer.parseInt(request.getParameter("id"));
//		Employee ExistingEmployee=EmployeeDao.selectEmployee(id);
//		jakarta.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/EmployeeRegister.jsp");
//		request.setAttribute("employee", ExistingEmployee);
//		dispatcher.forward(request, response);
//		
//		
//	}
//	
//	private void insertEmployee(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException {
//		String name=request.getParameter("name");
//		String email=request.getParameter("email");
//		String age=request.getParameter("age");
//		String phone=request.getParameter("phone");
//		String password=request.getParameter("password");
//		
//		Employee newEmployee=new Employee(name, email, age, phone, password);
//		EmployeeDao.insertEmployee(newEmployee);
//		response.sendRedirect("list");
//	}
//	private void updateEmployee(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ClassNotFoundException {
//		String name=request.getParameter("name");
//		String email=request.getParameter("email");
//		String age=request.getParameter("age");
//		String phone=request.getParameter("phone");
//		String password=request.getParameter("password");
//		
//		Employee newEmployee=new Employee(name, email, age, phone, password);
//		EmployeeDao.UpdateEmployee(newEmployee);
//		response.sendRedirect("list");
//	}
//	
//	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ClassNotFoundException {
//		int id=Integer.parseInt(request.getParameter("id"));
//		EmployeeDao.deleteEmployee(id);
//		response.sendRedirect("list");
//	}
	
//...



