package printingUtilities;

import entities.Person;

import java.util.ArrayList;

public class ConsolePrinter implements Printer{

    public void print(ArrayList<Person> guests, String option) {
        Style style = new Style(option);
        for (Person guest : guests) {
            System.out.println(style.accessName(guest,option));
        }
    }
}
