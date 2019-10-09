package application.utilities;

public class StringTool {

    public static String wrapFirstCharacter(String inputString) {
        return "("+inputString.substring(0,1)+")"+inputString.substring(1);
    }
}
