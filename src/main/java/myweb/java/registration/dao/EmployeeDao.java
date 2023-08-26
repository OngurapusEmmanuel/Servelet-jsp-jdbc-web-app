package myweb.java.registration.dao;

import myweb.java.registration.model.Employee;
import java.sql.*;
import java.util.*;

public class EmployeeDao {
	
	private static String username="localhost";
	private static String password="";
	
	private static final String INSERT_USERS_SQL="INSERT INTO register(name,age,email,phone,password) VALUES(?,?,?,?,?)";
	
		//int result=0;
	
	
	
	protected static Connection getConnection() throws ClassNotFoundException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/emmerh?useSSL=false",username,password);
		}
		catch(SQLException e){
			e.printStackTrace();
			
		} 
		
		return connection;
		 
	}
	//new Employee
	public void registerEmployee(Employee employee) throws SQLException {
		try(Connection connection=getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
			
		preparedStatement.setString(1,employee.getName());
		preparedStatement.setString(2, employee.getEmail());
		preparedStatement.setString(3,  employee.getAge());
		preparedStatement.setString(4, employee.getPhone());
		preparedStatement.setString(5, employee.getPassword());
		preparedStatement.executeUpdate();		
	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
//	//update employee
//	public static boolean UpdateEmployee(Employee employee) throws SQLException, ClassNotFoundException {
//		boolean rowUpdated;
//		try(Connection connection=getConnection();
//				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
//			preparedStatement.setString(1,employee.getName());
//			preparedStatement.setString(2, employee.getEmail());
//			preparedStatement.setString(3,  employee.getAge());
//			preparedStatement.setString(4, employee.getPhone());
//			preparedStatement.setString(5, employee.getPassword());
//		rowUpdated=	preparedStatement.executeUpdate()>0;	
//			
//		}
//		return rowUpdated;
//	}
//	
//	//select all employees
//	public static List<Employee> selectAllEmployees() throws ClassNotFoundException{
//		List<Employee> employees=new ArrayList<Employee>();
//		
//		//Establish connection
//		try(Connection connection=getConnection();
//				//creating a print Statement
//				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
//					System.out.println(preparedStatement);
//					
//					//execute query
//					ResultSet rs=preparedStatement.executeQuery();
//					
//					while(rs.next()) {
//						int id=rs.getInt("id");
//						String name=rs.getString("name");
//						String email=rs.getString("email");
//						String age=rs.getString("age");
//						String phone=rs.getString("phone");
//						String password=rs.getString("password");
//						employees.add(new Employee(id,name,email,age, phone, password));
//					}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return employees;
//	}
//	
//	//delete user
//	public static boolean deleteEmployee(int id) throws SQLException, ClassNotFoundException {
//		boolean rowDeleted;
//		try(Connection connection=getConnection();
//				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
//			
//			preparedStatement.setInt(1,id);
//			rowDeleted=preparedStatement.executeUpdate()>0;
//		}
//		return rowDeleted;
//	}
//	public static Employee selectEmployee(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public static void insertEmployee(Employee newEmployee) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
//// void registerEmployee(Employee employee) throws ClassNotFoundException{
////crud operations
//	//private static final String SELECT_USER_BY_ID="select id,name,email from register
}
