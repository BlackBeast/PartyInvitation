package entities;

import nameFormats.FormatRepresentation;

public class Person {
    private Name name;
    private Address address;
    private String gender;
    private Age age;

    public Person(Name name, Address address, String gender, Age age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public String formatUsing(FormatRepresentation rep) {
        return String.format("%s %s", Gender.valueOf(gender), name.formatUsing(rep));
    }

    public boolean isOfOrAboveAge(int givenAge) {
        return age.checkIfThePersonIsOfOrAboveAge(givenAge);
    }

    public boolean isOfThisCountry(String givenCountry){
        return address.isResidentOfThisCountry(givenCountry);
    }

}
