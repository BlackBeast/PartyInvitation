package printingUtilities;

import entities.Person;

import java.util.ArrayList;

public interface Printer {
    void print(ArrayList<Person> guests, String option);
}
