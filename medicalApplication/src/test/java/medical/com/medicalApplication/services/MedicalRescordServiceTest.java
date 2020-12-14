package medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;

public class MedicalRescordServiceTest {
	private MedicalRescordService medicalRecordService;
	private List<Patient>patients;
	
	@Before
	public void setUp() throws Exception {
		medicalRecordService = MedicalRescordService.getReference();
		patients = medicalRecordService.getAllPatients();
	}

	@Test
	public void testAddPatient() {
		assertNotNull("patient list is null", patients);
		assertTrue("unable to locate specified patient id", patients.stream().anyMatch(patient -> patient.getId().equals("7272")));
		assertTrue("unable to locate specified patient name", patients.stream().anyMatch(patient -> patient.getName().equals("John")));	
	}
	
	@Test
	public void testGetMedicalRecord() {
		MedicalRecord medicalRecord = medicalRecordService.getMedicalRecord("7272");
		Patient patients = medicalRecord.getPatient();
		assertNotNull("medicalRecordService returned null object", medicalRecord);
		assertEquals("patient:7272 returned incorrect name", patients.getName(), "John");
		assertEquals("John returned incorrect ID", patients.getId(), "7272");
	}
	
	@Test
	public void testGetPatient() {
		Patient patient = medicalRecordService.getPatient("7272");
		assertNotNull("patient returned null object", patient);
		assertEquals("patient:7272 returned incorrect name", patient.getName(), "John");
		assertEquals("patient:John returned incorrect ID", patient.getId(), "7272");
	}
	
	@Test
	public void testSettingAllPatients() {
		medicalRecordService.addPatient("John", "7272");
		assertTrue(medicalRecordService.getAllPatients().stream().allMatch(name -> name.getName().equals("John")));
	}
	
	@Test
	public void testGetPatientsWithAllergies() {
		String patientId = "7272";
		Allergey peanutAllergy = new Allergey("Peanuts");
		
		medicalRecordService.addPatient("John", "7272");
		MedicalRecord record = medicalRecordService.getMedicalRecord(patientId);
		record.getHistory().addAllergy(peanutAllergy);
		
		List<Patient>patientList = medicalRecordService.getPatientsWithAllergies("Peanuts");
		assertNotNull("allergey object is null", peanutAllergy);
		assertNotNull("medical record object is null", record);
		assertNotNull("patientList object is null", record);
		assertTrue("testGetAllergies returned null or 0", patientList.size() >= 1);
	}
	
	@After
	public void after() {
		medicalRecordService = null;
		patients = null;
	}

}
