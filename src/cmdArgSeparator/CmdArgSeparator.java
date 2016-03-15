package cmdArgSeparator;

import filterMethods.AgeFilter;
import filterMethods.CountryFilter;
import filterMethods.Filter;

import java.util.ArrayList;

public class CmdArgSeparator {
    private final String[] args;

    public CmdArgSeparator(String[] args) {
        this.args = args;
    }

    public String[] fileSeparator() {
        String allFiles = "";
        for (String argument : args) {
            if (argument.charAt(0)!='-')
                allFiles += argument + ",";
        }

        return allFiles.trim().split(",");
    }

    public String[] optionSeparator() {
        String allOptions = "";
        for (String argument : args) {
            if (argument.charAt(0) == '-' && argument.length() == 2)
                allOptions += argument + ",";
        }
        if(allOptions.equals(""))
            allOptions = "-f";

        return allOptions.trim().split(",");
    }

    public ArrayList<Filter> getFilters(){
        ArrayList<Filter> filters = new ArrayList<Filter>();
        for (String argument : args) {
            if (argument.charAt(0) == '-' && argument.length() > 2) {
                if(argument.charAt(1) == 'c'){
                    String country = argument.substring(2);
                    filters.add(new CountryFilter(country));
                }
                else if(argument.charAt(1)=='a'){
                    int age = Integer.parseInt(argument.substring(2));
                    filters.add(new AgeFilter(age));
                }
            }
        }
        return filters;
    }


}
