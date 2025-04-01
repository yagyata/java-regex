package BasicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicencePlateNo {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}+[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        String numberPlate = "PB7827";

        Matcher matcher = pattern.matcher(numberPlate);
        System.out.println("Number Plate: " + numberPlate + "\nIs Valid? " + matcher.matches());
    }
}
