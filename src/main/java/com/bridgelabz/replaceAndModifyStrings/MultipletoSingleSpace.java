package com.bridgelabz.replaceAndModifyStrings;

public class MultipletoSingleSpace {
    public static void main(String[] args) {
        String input = "This  is  an example      with   multiple     spaces.";
        String replacedText = input.replaceAll("\\s+", " ");
        System.out.println(replacedText);
    }
}
