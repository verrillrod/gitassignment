package Question7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	@Test
	public void testDogDetails() {
	    // Create a dog
	    Dog dog = new Dog("Buddy", "Labrador");

	    // Verify name and breed using getters
	    assertEquals("Buddy", dog.getName());
	    assertEquals("Labrador", dog.getBreed());

	    // Modify attributes using setter methods
	    dog.setName("Rocky");
	    dog.setBreed("Golden Retriever");

	    // Verify updated values using getters
	    assertEquals("Rocky", dog.getName());
	    assertEquals("Golden Retriever", dog.getBreed());
	}

}
