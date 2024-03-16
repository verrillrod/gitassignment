package Question8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	 @Test
	    public void testCalculateTotalSalary() {
	        // Create an employee with a basic salary of 50000
	        Employee employee = new Employee("John Doe", "Software Engineer", 50000);

	        // Calculate the expected total salary
	        double expectedTotalSalary = 50000 + (0.1 * 50000) + 5000; // Basic + DA (10%) + HRA

	        // Verify if the calculated total salary matches the expected total salary
	        assertEquals(expectedTotalSalary, employee.calculateTotalSalary(), 0.01);
	    }


}
