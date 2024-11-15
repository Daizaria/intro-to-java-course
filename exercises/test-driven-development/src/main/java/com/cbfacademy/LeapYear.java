package com.cbfacademy;
//what will run if we pass method
public class LeapYear {
    public static boolean isLeapYear(int year) {
        // Check if the year is a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Divisible by 400
            } else {
                return true; // Divisible by 4 but not by 100
            }
        }
        return false; // Not divisible by 4
    }

    public static void main(String[] args) {
        int year = 2024; // Example year to check
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
