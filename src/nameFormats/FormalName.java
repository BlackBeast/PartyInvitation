package nameFormats;

public class FormalName implements FormatRepresentation{

    @Override
    public String formatName(String firstName, String sirName){
        return String.format("%s, %s",sirName,firstName);
    }
}
