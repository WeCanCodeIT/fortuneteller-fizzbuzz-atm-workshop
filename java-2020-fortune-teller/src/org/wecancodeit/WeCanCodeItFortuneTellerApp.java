package org.wecancodeit;


import java.util.Scanner;

public class WeCanCodeItFortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to We Can Code IT's Fortune Teller Application!");

        Scanner input = new Scanner(System.in);

        String firstName = getFirstName(input);
        String lastName = getLastName(input);
        int userAge = getAge(input);
        int userBirthMonth = getBirthMonth(input);
        input.nextLine();
        String favoriteColor = getFavoriteColor(input);
        int siblingCount = getSiblingCount(input);
        int yearsToRetirement = getRetirement(input, userAge);
        String vacationHomeLocation = getVacationHome(input, siblingCount);
        String modeOfTransportation = getTransportation(input, favoriteColor);
        Double bankBalance = getBalance(input, userBirthMonth);

        //[First Name] [Last Name] will retire in [# of years] with [bank balance] in the bank, a vacation home in [location], and travel by [mode of transportation].
        System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years,\n" +
                "with $" + bankBalance + " in the bank,\n" +
                "a vacation home in "+ vacationHomeLocation +",\n" +
                "and travel by "+modeOfTransportation + ".");
    }

    private static Double getBalance(Scanner input, int userBirthMonth) {
        double bankBalance = 0.0;
        if (userBirthMonth > 0 && userBirthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (userBirthMonth > 4 && userBirthMonth <= 8) {
            bankBalance = 3687105.42;
        }else if (userBirthMonth> 8 && userBirthMonth<=12){
            bankBalance = 45.65;
        }
        return bankBalance;
    }

    private static String getTransportation(Scanner input, String favoriteColor) {
        String modeOfTransportation = "";
        switch (favoriteColor.toLowerCase()) {
            case "red":
                modeOfTransportation = "Maserati";
                break;
            case "orange":
                modeOfTransportation = "seven chihuahuas pulling a chariot.";
                break;
            case "yellow":
                modeOfTransportation = "school bus";
                break;
            case "green":
                modeOfTransportation = "Tesla";
                break;
            case "blue":
                modeOfTransportation = "Yugo";
                break;
            case "indigo":
                modeOfTransportation = "Honda Civic";
                break;
            case "violet":
                modeOfTransportation = "Mini Cooper";
                break;
            default:
                modeOfTransportation = "taxi cab";
        }
        return modeOfTransportation;
    }

    public static String getVacationHome(Scanner input, int siblingCount) {
        String vacationHomeLocation = "";
        if (siblingCount == 0) {
            vacationHomeLocation = "Boca Raton, FL";
        } else if (siblingCount == 1) {
            vacationHomeLocation = "Nassau, Bahamas";
        } else if (siblingCount == 2) {
            vacationHomeLocation = "Ponta Negra, Brazil";
        } else if (siblingCount == 3) {
            vacationHomeLocation = "Portland, Oregon";
        } else if (siblingCount > 3) {
            vacationHomeLocation = "Baton Rouge, LA";
        } else {
            vacationHomeLocation = "Chernobyl, Ukraine";
        }
        return vacationHomeLocation;
    }


    public static int getRetirement(Scanner input, int userAge) {
        int yearsToRetirement = 0;
        if (userAge % 2 == 0) {
            yearsToRetirement = 12;
        } else {
            yearsToRetirement = 14;
        }
        return yearsToRetirement;
    }

    public static int getSiblingCount(Scanner input) {
        System.out.println("How many siblings do you have:");
        return input.nextInt();
    }

    public static String getFavoriteColor(Scanner input) {
        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know the colors");
        String favoriteColor = input.nextLine();
        if (favoriteColor.equalsIgnoreCase("help")) {
            System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, and Violet. Use one of these values.");
            favoriteColor = input.nextLine();
        }
        return favoriteColor;
    }

    public static int getBirthMonth(Scanner input) {
        System.out.println("What is your birth month number:");
        int birthMonth = input.nextInt();

        while(birthMonth < 1 || birthMonth > 12){
            System.out.println("Birth month number must be between 1 and 12");
            birthMonth = input.nextInt();
        }

        return birthMonth;
    }

    public static int getAge(Scanner input) {
        System.out.println("What is your age:");
        return input.nextInt();
    }

    public static String getFirstName(Scanner scanner){
        System.out.println("What is your first name:");
        return scanner.nextLine();
    }
    public static String getLastName(Scanner scanner){
        System.out.println("What is your last name:");
        return scanner.nextLine();
    }

}
