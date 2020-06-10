package pk.cui.sc.exam.lab;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;
public class LabTest {

	@Test
	public void fahrenheitToCentigradeTest() {
		int expected = 0;
		int actual= Lab.fahrenheitToCentigrade(32);
		assertTrue(expected==actual);
	}
	
	@Test
	public void centigradeToFahrenheitTest() {
		int expected=32;
		int actual= Lab.centigradeToFahrenheit(0);
		assertTrue(expected==actual);
	}
	
	@Test
	public void removeSignOfExclaimationTest() {
	
		String expected="Hi";
		String actual=Lab.removeSignOfExclaimation("Hi!");
		assertEquals(expected,actual);
	}
	
	@Test
	public void getCurrentDayTest() {
		 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 int expected = calendar.get(Calendar.DAY_OF_MONTH);
		assertEquals(expected,Lab.getCurrentDay());
	}
	
	@Test
	public void getCurrentMonthTest() {
		 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 int expected = calendar.get(Calendar.MONTH)+1;
		assertEquals(expected,Lab.getCurrentMonth());
	}
	
	@Test
	public void getCurrentYearTest() {
		 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 int expected = calendar.get(Calendar.YEAR);
		assertEquals(expected,Lab.getCurrentYear());
	}

}
