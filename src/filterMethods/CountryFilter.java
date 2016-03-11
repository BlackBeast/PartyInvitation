package filterMethods;

import entities.Person;

public class CountryFilter implements Filter {
    private String country;

    public CountryFilter(String country) {
        this.country = country;
    }

    @Override
    public boolean isAValidGuest(Person guest) {
        return guest.isOfThisCountry(country);
    }
}
