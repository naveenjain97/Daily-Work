package com.cts.training.test1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDao;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

public class EmpUnitTest {

	private static EmployeeDao employeeDao;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDao = new EmployeeDAOImpl();
	}

	@Ignore
	@Test
	public void test_add_success() {
		Employee emp = new Employee(1, "Naveen", "Indore", "SD", 22, 24700, 908787874);
		assertEquals(true, employeeDao.saveEmployee(emp));
	}

	@Ignore
	@Test
	public void test_update_employee_success() {
		EmployeeDao empObj = new EmployeeDAOImpl();
		Employee employee1 = empObj.getEmployeeById(2);
		employee1.setName("Naveen");
		empObj.updateEmployee(employee1);
		assertEquals(true, employeeDao.updateEmployee(employee1));
	}

	@Ignore
	@Test
	public void test_delete_employee_success() {

		EmployeeDao empObj = new EmployeeDAOImpl();
		Employee emp = empObj.getEmployeeById(9);
		assertEquals(true, employeeDao.deleteEmployee(emp));
	}
	@Ignore
	@Test
	public void test_getElementById_success() {
//		EmployeeDao empObj= new EmployeeDAOImpl();
		Employee emp = employeeDao.getEmployeeById(1);
		assertEquals("Naveen", emp.getName());
	}
@Ignore
	@Test
	public void test_getAllEmployee_success() {
		List<Employee> list =employeeDao.getAllEmployees();
		//assertEquals("list",employeeDao. getAllEmployees());
		assertEquals("Vijay",list.get(2).getName());
		//assertEquals(7,list.size());
	}
@Ignore
@Test(expected =NullPointerException.class)
public void test_getemployee_by_id_success()
{
	Employee emp=employeeDao.getEmployeeById(100);
	assertEquals("Harshita",emp.getName());
}
@Ignore
@Test(expected =NullPointerException.class)
public void test_delete_employee_by_id_success() {
	//Employee emp=employeeDao.deleteEmployee();
	//Employee emp = employeeDao.deleteEmployee(employee);
	employee=employeeDao.getEmployeeById(1);
	assertEquals("true",employeeDao.deleteEmployee(employee));
}
@Ignore
@Test(expected =NullPointerException.class)
public void test_update_employee_by_id_success() {
	//Employee emp=employeeDao.deleteEmployee();
	//Employee emp = employeeDao.deleteEmployee(employee);
	employee=employeeDao.getEmployeeById(1);
	assertEquals("true",employeeDao.updateEmployee(employee));
}

@Test(expected=MySQLIntegrityConstraintViolationException.class)
public void test_add_fail_success() {
	Employee emp = new Employee(1, "Naveen", "Indore", "SD", 22, 24700, 908787874);
	assertEquals(true, employeeDao.saveEmployee(emp));
}
	
}