package filterMethods;

import entities.Person;

public class AgeFilter implements Filter {
    private int age;

    public AgeFilter(int age) {
        this.age = age;
    }

    @Override
    public boolean isAValidGuest(Person guest) {
        return guest.isOfOrAboveAge(age);
    }
}
