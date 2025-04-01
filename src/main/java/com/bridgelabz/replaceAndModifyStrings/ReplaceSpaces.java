package com.bridgelabz.replaceAndModifyStrings;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This  is  an example      with   multiple     spaces.";
        String replacedText = input.replaceAll("\\s+", " ");
        System.out.println(replacedText);
    }
}
