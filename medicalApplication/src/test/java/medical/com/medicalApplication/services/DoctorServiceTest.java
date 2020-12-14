package medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;

public class DoctorServiceTest {
	private Doctor doctor;
	private DoctorService doctorservice;
	
	@Before
	public void setUp() throws Exception{
		this.doctor = new Doctor("Mark", "2934");
		this.doctorservice = new DoctorService();
		new ArrayList<Doctor>();
		DoctorService.getReference().addDoctor("Mark", "2934");
	}

	@Test
	public void testAddDoctor() {
		assertTrue(doctor.getName().equals("Mark"));
	}
	
	@Test
	public void testSettingAllDoctors() {
		doctorservice.addDoctor("Mark", "2934");
		assertTrue(doctorservice.getAllDoctors().stream().anyMatch(name -> name.getName().equals("Mark")));
	}

}
