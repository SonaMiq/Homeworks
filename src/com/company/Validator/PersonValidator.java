package com.company.Validator;

public final class PersonValidator {
    private PersonValidator() {

    }

    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean isValidFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            return false;
        }
        int len = firstName.length();
        return (len >= 3 && len <= 15);
    }

    public static boolean isValidLastName(String lastName) {
        if (lastName == null || lastName.length() == 0) {
            return false;
        }
        int len = lastName.length();
        return len >= 6 && len <= 20;
    }

    public static boolean isValidPassportID(String passportId) {
        if (passportId == null || passportId.length() == 0)
            return false;
        return passportId.length() == 8 && passportId.substring(0, 2).equals("AN") && passportId.substring(2).length() == 6
                && isDigits(passportId.substring(2));

    }

    private static boolean isDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;
        }
        return true;
    }

    public static boolean isValidGender(String gender) {
        if (gender == null) {
            return false;
        }
        return gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female");
    }
}



