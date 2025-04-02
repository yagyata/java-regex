package com.bridgelabz.advancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        String input = "This is is a repeated repeated word test";

        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            System.out.print(matcher.group(1) + ", ");
        }
    }
}
