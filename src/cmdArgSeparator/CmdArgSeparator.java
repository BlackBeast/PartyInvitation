package cmdArgSeparator;

public class CmdArgSeparator {
    public String[] options;
    public String[] nonOptions;

    public CmdArgSeparator(String[] args) {
        this.options = optionSeparator(args);
        this.nonOptions = fileSeparator(args);
    }

    private String[] fileSeparator(String[] args) {
        String allFiles = "";
        for (String argument : args) {
            if (argument.charAt(0)!='-')
                allFiles += argument + ",";
        }

        return allFiles.trim().split(",");
    }

    public String[] optionSeparator(String[] args) {
        String allOptions = "";
        for (String argument : args) {
            if (argument.charAt(0) == '-' && argument.length() == 2)
                allOptions += argument + ",";
        }
        if(allOptions.equals(""))
            allOptions = "-f";

        return allOptions.trim().split(",");
    }


}
