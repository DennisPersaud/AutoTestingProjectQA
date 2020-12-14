package medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AllergeyTest {
	private Allergey allergey;
	
	@Before
	public void setUp() throws Exception{
		this.allergey = new Allergey("Peanut");
	}

	@Test
	public void testSetName() {
		assertTrue(allergey.getName().equals("Peanut"));
	}

}
