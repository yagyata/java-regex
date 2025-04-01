package com.bridgelabz.replaceAndModifyStrings;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        for(String word : badWords) {
            text = text.replaceAll(word, "****");
        }
        System.out.println(text);
    }
}
