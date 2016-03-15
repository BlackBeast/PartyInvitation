package guestGenerator;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestListParserTest {
    String fileData;
    @Before
    public void setUp() throws Exception {
        fileData = "Ramon,Windler,Female,24,Crooks ton,Georgia,Bangladesh\nBuddy,Nitzsche,Male,34,Katlynn view,Illinois,Romania \nVivienne,Stamm,Male,33,New Alanna,Illinois,Macedonia \nAnya,Cruickshank,Male,30,Veda haven,Illinois,Romania \nDaisha,Steuber,Male,19,Veda haven,North Carolina,Macedonia";
    }

    @Test
    public void testForTheGuestListToAddAllTheGuestsToList() throws Exception {
        GuestListParser guests = new GuestListParser(fileData);
        guests.parse();
        int size = guests.parse().size();
        assertEquals(5,size);
    }

}