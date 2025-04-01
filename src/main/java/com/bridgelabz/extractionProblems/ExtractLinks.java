package com.bridgelabz.extractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);

        String text = "Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
