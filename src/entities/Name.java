package entities;

import nameFormats.FormatRepresentation;

public class Name {
    private String firstName;
    private String sirName;

    public Name(String firstName, String sirName) {
        this.firstName = firstName;
        this.sirName = sirName;
    }

    public String formatUsing(FormatRepresentation rep){
        return rep.formatName(firstName,sirName);
    }


}
