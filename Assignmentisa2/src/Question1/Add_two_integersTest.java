package Question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Add_two_integersTest {


	@Test
    public void testAdditionPositiveNumbers() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 15;
        int actualResult = Add_two_integers.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        int num1 = -8;
        int num2 = -3;
        int expectedResult = -11;
        int actualResult =Add_two_integers.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}
