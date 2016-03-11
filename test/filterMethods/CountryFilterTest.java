package filterMethods;

import entities.Address;
import entities.Name;
import entities.Person;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryFilterTest {
    @Test
    public void test_person_class_to_find_wheather_the_person_is_above_a_particular_country() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Uganda");
        Person person = new Person(name,address,"Female",21);
        CountryFilter validCountry = new CountryFilter("Uganda");
        assertTrue(validCountry.isAValidGuest(person));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_of_a_particular_country() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Uganda");
        Person person = new Person(name,address,"Female",21);
        CountryFilter validCountry = new CountryFilter("India");
        assertFalse(validCountry.isAValidGuest(person));
    }
}