package entities;

public class Address {
    private String city,state,country;

    public Address(String city,String state,String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString(){
        return String.format("%s, %s, %s",city,state,country);
    }

    public boolean isResidentOfThisCountry(String givenCountry) {
        return this.country.equals(givenCountry);
    }
}
