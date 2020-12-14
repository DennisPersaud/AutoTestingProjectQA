package medical.com.medicalApplication.model;

import org.junit.Before;
import org.junit.Test;

public class MedicalRecordTest {
	private MedicalRecord medicalrecord;
	private Patient patient;
	
	@Before
	public void setUp() throws Exception{
		patient = new Patient("John", "7272");
		this.medicalrecord = new MedicalRecord(patient);
	}

	@Test
	public void testGetPatient() {
		System.out.println(medicalrecord.getPatient());
	}
	
	@Test
	public void testGetHistory() {
		System.out.println(medicalrecord.getHistory());
	}

}
