package entities;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddressTest {
    @Test
    public void test_method_inside_Address_class_to_check_if_the_person_is_from_the_same_country() throws Exception {
        Address address = new Address("Bangalore","Karnataka","India");
        assertTrue(address.isResidentOfThisCountry("India"));
        assertFalse(address.isResidentOfThisCountry("America"));
    }
}