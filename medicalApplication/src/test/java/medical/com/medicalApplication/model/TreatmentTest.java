package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreatmentTest {
	private Treatment treatment;
	
	@Before
	public void setUp() throws Exception{
		this.treatment = new Treatment("06/23/20", "Asthma", "Acute respiratory distress");
	}

	@Test
	public void testSetTreatmentDate() {
		assertTrue(treatment.getTreatmentDate().equals("06/23/20"));
	}
	
	@Test
	public void testSetDiagnose() {
		assertTrue(treatment.getDiagnose().equals("Asthma"));
	}
	
	@Test
	public void testSetDescription() {
		assertTrue(treatment.getDescription().equals("Acute respiratory distress"));
	}

}
