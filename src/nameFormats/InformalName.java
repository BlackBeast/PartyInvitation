package nameFormats;

public class InformalName implements FormatRepresentation {
    @Override
    public String formatName(String firstName, String sirName){
        return String.format("%s %s",firstName,sirName);
    }
}
