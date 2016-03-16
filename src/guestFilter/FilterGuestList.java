package guestFilter;

import entities.Person;
import filterMethods.Filter;

import java.util.ArrayList;

public class FilterGuestList {
    private ArrayList<Filter> filters ;
    private ArrayList<Person> guests;
    private ArrayList<Person> eligibleGuests;

    public FilterGuestList(ArrayList<Filter> filters, ArrayList<Person> guests) {
        this.filters = filters;
        this.guests = guests;
        this.eligibleGuests = new ArrayList<Person>();
    }

    private boolean isEligibleForAllCriteria(Person guest){
        for (Filter filter : filters) {
            if(!filter.isAValidGuest(guest))
                return false;
        }
        return true;
    }


    public ArrayList<Person> getFilteredGuest(){
        for (Person guest : guests) {
            if(isEligibleForAllCriteria(guest))
                eligibleGuests.add(guest);
        }
        return eligibleGuests;
    }
}
