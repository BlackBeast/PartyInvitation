package entities;

import nameFormats.FormatRepresentation;

public class Person {
    protected Name name;
    protected Address address;
    protected String gender;
    protected int age;

    public Person(Name name, Address address, String gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public String formatUsing(FormatRepresentation rep) {
        return String.format("%s %s", Gender.valueOf(gender), name.formatUsing(rep));
    }

    public boolean isOfOrAboveAge(int givenAge) {
        return this.age >= givenAge;
    }

    public boolean isOfThisCountry(String givenCountry){
        return address.isResidentOfThisCountry(givenCountry);
    }

}
