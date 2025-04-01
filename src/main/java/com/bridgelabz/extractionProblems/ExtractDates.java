package com.bridgelabz.extractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(1[0-9]{3}|20[0-9]{2})\\b";
        Pattern pattern = Pattern.compile(regex);

        String text = "The events are scheduled for 12/05/2025, 15/08/2024, and 29/02/2020.";
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
