package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PatientHistoryTest {
	private PatientHistory history;
	private ArrayList<Allergey> allergies;
	
	@Before
	public void setUp() throws Exception{
		this.history = new PatientHistory();
		this.allergies = new ArrayList<Allergey>();
		allergies.add(new Allergey("Peanut"));
		allergies.add(new Allergey("Dust"));
	}
	
	@Test
	public void testSettingAllergies() {
		history.addAllergy(new Allergey("Peanut"));
		assertTrue(history.getAllergies().stream().anyMatch(name -> name.getName().equals("Peanut")));
	}
	
	@Test
	public void testSettingTreatments() {
		history.addTreatment(new Treatment("06/12/20", "Asthma", "Acute respiratory distress"));
		assertTrue(history.getAllTreatments().stream().anyMatch(treatmentDate -> treatmentDate.getTreatmentDate().equals("06/12/20") && treatmentDate.getDiagnose().equals("Asthma") && treatmentDate.getDescription().contentEquals("Acute respiratory distress")));
	}
	
	@Test
	public void testSettingMedications() {
		history.addMedication(new Medication("albuterol", "07/12/20", "08/15/20", "5mg"));
		assertTrue(history.getAllMedications().stream().anyMatch(name -> name.getName().equals("albuterol") && name.getStartDate().equals("07/12/20") && name.getEndDate().equals("08/15/20") && name.getDose().equals("5mg")));
	}

}
