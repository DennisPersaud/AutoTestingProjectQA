package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
	private Doctor doctor;
	
	@Before
	public void setUp() throws Exception{
		this.doctor = new Doctor("Michael", "4444");
	}

	@Test
	public void testSetName() {
		assertTrue(doctor.getName().equals("Michael"));
	}
	
	@Test
	public void testSetId() {
		assertTrue(doctor.getId().equals("4444"));
	}

}
