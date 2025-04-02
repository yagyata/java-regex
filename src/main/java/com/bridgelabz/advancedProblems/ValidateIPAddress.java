package com.bridgelabz.advancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"; //0-9 | 10-99 | 100-199 | 200-249 | 249-255
        Pattern pattern = Pattern.compile(regex);
        String ipAddress = "192.168.1.1";
        Matcher matcher = pattern.matcher(ipAddress);

        System.out.println("IP Address: " + ipAddress + "\nIs valid? " + matcher.matches());

    }
}
