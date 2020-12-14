package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee employee;
	
	@Before
	public void setUp() throws Exception{
		this.employee = new Employee("Dennis", "1234");
	}

	@Test
	public void testSetName() {
		assertTrue(employee.getName().equals("Dennis"));
	}
	
	@Test
	public void testSetId() {
		assertTrue(employee.getId().equals("1234"));
	}
	
	@Test
	public void testSetPassword() {
		assertTrue(employee.getPassword().equals("Open"));
	}

}
