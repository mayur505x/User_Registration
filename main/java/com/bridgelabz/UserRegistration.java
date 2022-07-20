package com.bridgelabz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter a Last Name: ");
        String lastName = scan.nextLine();
        UserRegistration.firstNameValidator(firstName);
        System.out.println("First name is Valid ? " + checkValid(firstNameValidator(firstName)));
        UserRegistration.lastNameValidator(lastName);
        System.out.println("Last name is Valid ?" + checkValid(lastNameValidator(lastName)));
    }

    public static String checkValid(Boolean validator) {
        if (validator) {
            return "Valid";
        } else {
            return "Not Valid";
        }
    }

    public static boolean firstNameValidator(String firstName) {
        return  firstName.matches("[A-Z][a-z]{3,}");
    }

    public static boolean lastNameValidator(String lastName) {
        return lastName.matches("[A-Z][a-z]{3,}");
    }
}
