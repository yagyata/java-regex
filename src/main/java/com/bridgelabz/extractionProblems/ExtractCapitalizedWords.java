package com.bridgelabz.extractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";

        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}
