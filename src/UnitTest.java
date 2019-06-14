import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void testTimeInterval() {
		try {
			TimeInterval t1 = new TimeInterval("11:00", "12:00");
			TimeInterval t2 = new TimeInterval("12:00", "13:00");
			assertEquals(false, t1.isOverlap(t2));
			
			t1 = new TimeInterval("11:00", "12:00");
			t2 = new TimeInterval("11:30", "12:30");
			assertEquals(true, t1.isOverlap(t2));
			
			t1 = new TimeInterval("11:00", "12:00");
			t2 = new TimeInterval("10:30", "11:30");
			assertEquals(true, t1.isOverlap(t2));
			
			t1 = new TimeInterval("11:00", "12:00");
			t2 = new TimeInterval("10:30", "12:30");
			assertEquals(true, t1.isOverlap(t2));
			
			t1 = new TimeInterval("11:00", "12:00");
			t2 = new TimeInterval("11:10", "11:50");
			assertEquals(true, t1.isOverlap(t2));
			
			t1 = new TimeInterval("11:00", "12:00");
			t2 = new TimeInterval("12:01", "13:00");
			assertEquals(false, t1.isOverlap(t2));
			
			t1 = new TimeInterval("11:00", "16:00");
			t2 = new TimeInterval("17:00", "22:00");
			assertEquals(false, t1.isOverlap(t2));

			t1 = new TimeInterval("17:00", "22:00");				
			assertEquals("17:00 - 22:00", t1.toString());
			
			t1 = new TimeInterval("1:30", "2:25");				
			assertEquals("01:30 - 02:25", t1.toString());
			
			t1 = new TimeInterval("17:29", "22:13");				
			assertEquals("17:29 - 22:13", t1.toString());
			
			t1 = new TimeInterval("17:00", "16:00");

												
		} catch (Exception e) {
			assertEquals("Invalid time interval! \n"
					+ "Start time must be earlier than finish time.", e.getMessage());
		}
		
	}
	
		

}
