package com.bridgelabz.BasicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]+[a-zA-z0-9_]{5,15}";
        Pattern pattern = Pattern.compile(regex);
        String input = "yagyataA1_123";

        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
