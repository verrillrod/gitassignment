package Question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DisplayFibonacciSeriesTest {

    @Test
    public void testDisplayFibonacciSeriesWith5Terms() {
        String expectedOutput = "0, 1, 1, 2, 3";
        assertEquals(expectedOutput, getFibonacciSeriesOutput(5));
    }

    @Test
    public void testDisplayFibonacciSeriesWith10Terms() {
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34";
        assertEquals(expectedOutput, getFibonacciSeriesOutput(10));
    }

    private String getFibonacciSeriesOutput(int n) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        DisplayFibonacciSeriesTest.displayFibonacciSeries(n);
        return outContent.toString().trim();
    }

	private static void displayFibonacciSeries(int n) {
		// TODO Auto-generated method stub
		
	}

}
