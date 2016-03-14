package filterMethods;

import entities.Address;
import entities.Age;
import entities.Name;
import entities.Person;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AgeFilterTest {
    @Test
    public void test_person_class_to_find_wheather_the_person_is_above_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Masaka","Kampala","Uganda");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        AgeFilter ageLimit = new AgeFilter(20);
        assertTrue(ageLimit.isAValidGuest(person));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_of_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Masaka","Kampala","Uganda");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        AgeFilter ageLimit = new AgeFilter(21);
        assertTrue(ageLimit.isAValidGuest(person));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_below_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Masaka","Kampala","Uganda");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        AgeFilter ageLimit = new AgeFilter(25);
        assertFalse(ageLimit.isAValidGuest(person));
    }
}