package com.bridgelabz.advancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^[0-2][0-9]{3}\\.[0-255]\\.[0-255]\\.[0-255]$";
        Pattern pattern = Pattern.compile(regex);
        String ipAddress = "192.168.1.1";
        Matcher matcher = pattern.matcher(ipAddress);

        System.out.println("IP Address: " + ipAddress + "\nIs valid? " + matcher.matches());

    }
}
