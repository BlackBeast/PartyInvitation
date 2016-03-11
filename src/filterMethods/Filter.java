package filterMethods;

import entities.Person;

public interface Filter {
    boolean isAValidGuest(Person guest);
}
