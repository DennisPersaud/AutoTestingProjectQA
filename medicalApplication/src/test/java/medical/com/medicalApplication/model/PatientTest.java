package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {
	private Patient patient;
	
	@Before
	public void setUp() throws Exception{
		this.patient = new Patient("John", "7272");
	}
	
	@Test
	public void testSetName() {
		assertTrue(patient.getName().equals("John"));
	}

	@Test
	public void testSetId() {
		assertTrue(patient.getId().equals("7272"));
	}

}
