package entities;

public class Address {
    private String country;

    public Address(String country) {
        this.country = country;
    }

    public boolean isResidentOfThisCountry(String givenCountry) {
        return this.country.equals(givenCountry);
    }
}
