package Question6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
    public void testPersonDetails() {
        // Create a person
        Person person = new Person("Alice", 30);

        // Verify name and age using getters
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }


}
