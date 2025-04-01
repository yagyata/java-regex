package com.bridgelabz.advancedProblems;

public class ProgrammingLanguage {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages = {"Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby"};

        StringBuilder foundLanguages = new StringBuilder();
        for(String word : languages) {
            if(text.matches(".*\\b" + word + "\\b.*")) {
                if(foundLanguages.length() > 0) {
                    foundLanguages.append(", ");
                }
                foundLanguages.append(word);
            }
        }
        System.out.println(foundLanguages);
    }
}
