package models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John", "Doe", "123456789", 1990);
    }

    @Test
    void testGetId() {
        assertEquals("123456789", person.getId());
    }

    @Test
    void testGetLastName() {
        assertEquals("Doe", person.getLastName());
    }

    @Test
    void testGetName() {
        assertEquals("John", person.getName());
    }

    @Test
    void testGetYear() {
        assertEquals(1990, person.getYear());
    }

    @Test
    void testSetId() {
        person.setId("987654321");
        assertEquals("987654321", person.getId());
    }

    @Test
    void testSetLastName() {
        person.setLastName("Smith");
        assertEquals("Smith", person.getLastName());
    }

    @Test
    void testSetName() {
        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }

    @Test
    void testSetYear() {
        person.setYear(2000);
        assertEquals(2000, person.getYear());
    }
}