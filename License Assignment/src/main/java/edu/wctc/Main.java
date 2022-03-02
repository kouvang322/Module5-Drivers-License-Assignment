package edu.wctc;

import java.nio.channels.ClosedByInterruptException;
import java.util.Scanner;

public class Main {

    private static Scanner keyboard;

    public static void main(String[] args) {

        keyboard = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String userEnterFName = keyboard.nextLine();

        System.out.print("Enter middle initial: ");
        String userEnterMInitial = keyboard.nextLine();

        System.out.print("Enter last name: ");
        String userEnterLName = keyboard.nextLine();

        System.out.print("Enter year of birth: ");
        int userEnterYear = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter month of birth: ");
        int userEnterMonth = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter day of birth: ");
        int userEnterDay = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter gender. (M/F): ");
        char userEnterGender = keyboard.nextLine().toUpperCase().charAt(0);


        DriversLicense driversLicense = null;

        try {

            driversLicense = new DriversLicense(userEnterFName, userEnterMInitial, userEnterLName, userEnterYear, userEnterMonth, userEnterDay, userEnterGender);

        } catch (MissingNameException ex) {
            System.out.println(ex.message);
            System.exit(1);

        } catch (UnknownGenderCodeException ex) {
            System.out.println(ex.message);
            System.exit(2);

        } catch (InvalidBirthdayException ex) {
            System.out.println(ex.message);
            System.exit(3);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // creating objects of both license formats
        WisconsinFormatter wisconsinLicense = new WisconsinFormatter();

        System.out.println("Wisconsin drivers license");
        System.out.println(wisconsinLicense.formatLicenseNumber(driversLicense));

        System.out.println("Florida drivers license");
        FloridaFormatter floridaLicense = new FloridaFormatter();

        System.out.println(floridaLicense.formatLicenseNumber(driversLicense));
    }
}
