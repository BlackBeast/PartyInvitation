package cmdArgSeparator;

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


}
