package com.bridgelabz.extractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddresses {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        String text = "Contact us at ab_c.de@gmail.com support@example.com and info@company.org";

        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/*
Output:
ab_c.de@mail.com
support@example.com
info@company.org
 */