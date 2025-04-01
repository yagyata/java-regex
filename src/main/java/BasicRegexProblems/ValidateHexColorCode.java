package BasicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}+$";
        Pattern pattern = Pattern.compile(regex);
        String hexCode = "#fd4540";

        Matcher matcher = pattern.matcher(hexCode);
        System.out.println("Hex Colour Code: " + hexCode + "\nIs Valid? " + matcher.matches());

    }
}
