package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MedicationTest {
	private Medication medication;
	
	@Before
	public void setUp() throws Exception{
		this.medication = new Medication("albuterol", "07/12/20", "08/15/20", "5mg");
	}

	@Test
	public void testSetName() {
		assertTrue(medication.getName().equals("albuterol"));
	}
	
	@Test
	public void testSetStartDate() {
		assertTrue(medication.getStartDate().equals("07/12/20"));
	}
	
	@Test
	public void testSetEndDate() {
		assertTrue(medication.getEndDate().equals("08/15/20"));
	}
	
	@Test
	public void testSetDose() {
		assertTrue(medication.getDose().equals("5mg"));
	}

}
