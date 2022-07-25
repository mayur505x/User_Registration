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
        System.out.println("Enter Email ID: ");
        String emailId = scan.next();
        System.out.println("Enter Mobile Number: ");
        String mobileNumber = scan.next();
        System.out.println("Enter Password: ");
        String password = scan.next();
        UserRegistration.firstNameValidator(firstName);
        System.out.println("First name is Valid ? " + checkValid(firstNameValidator(firstName)));
        UserRegistration.lastNameValidator(lastName);
        System.out.println("Last name is Valid ?" + checkValid(lastNameValidator(lastName)));
        UserRegistration.emailValidator(emailId);
        System.out.println("Email ID is Valid ?" + checkValid(emailValidator(emailId)));
        UserRegistration.mobileNumberValidator(mobileNumber);
        System.out.println("Mobile Number is valid ?" + checkValid(mobileNumberValidator(mobileNumber)));
        UserRegistration.passwordValidator(password);
        System.out.println("Password is valid ?" + checkValid(passwordValidator(password)));

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
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }

    public static boolean emailValidator(String email) {
        return email.matches("^[abc]2(.+){1}[A-Za-z]*+@{1}[bl](.+)[co](.+)[in]$");
    }

    public static boolean mobileNumberValidator(String mobileNumber) {
        return mobileNumber.matches("^[9][1] [7-9][0-9]{9}$");
    }

    public static boolean passwordValidator(String password) {
        return password.matches("^[A-Z]{1}[a-z]{7,}$");
    }
}
