package printingUtilities;

import entities.Person;
import nameFormats.FormalName;
import nameFormats.FormatRepresentation;
import nameFormats.InformalName;

import java.util.HashMap;

public class Style {
    protected String option;
    private HashMap<String, FormatRepresentation> style;

    public Style(String option) {
        this.option = option;
        this.style = new HashMap<String, FormatRepresentation>();
        this.style.put("-f",new FormalName());
        this.style.put("-i",new InformalName());
    }



    public String accessName(Person guest, String option){
        return guest.formatUsing(style.get(option));
    }
}
