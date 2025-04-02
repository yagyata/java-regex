package com.bridgelabz.advancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String regex = "^((4[0-9]{3}|5[0-9]{3})(-?[0-9]{4}){3})";
        Pattern pattern = Pattern.compile(regex);
        String ccNumber = "5067-2568-3220-5684";

        Matcher matcher = pattern.matcher(ccNumber);
        System.out.println("Credit Card Number: " + ccNumber + "\nIs Credit Card Number Valid? " + matcher.matches());
    }
}
