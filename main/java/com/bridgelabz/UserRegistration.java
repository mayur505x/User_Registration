package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a First Name: ");
        String firstName = scan.nextLine();
        UserRegistration.firstNameValidator(firstName);
        System.out.println("First name is Valid ? " + checkValid(firstNameValidator(firstName))  );
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
}
