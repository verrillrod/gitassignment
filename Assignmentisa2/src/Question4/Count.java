package Question4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Count {

	@Test
	public void testCountDigitsWithPositiveNumber() {
	    int number = 12345;
	    int expectedCount = 5;
	    assertEquals(expectedCount, Count.countdigit(number));
	}

	private static Object countdigit(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testCountDigitsWithNegativeNumber() {
	    int number = -9876;
	    int expectedCount = 4;
	    assertEquals(expectedCount, Count.countdigit(number));
	}

}
