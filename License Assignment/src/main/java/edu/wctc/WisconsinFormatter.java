package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{


    
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        DriversLicense driversLicenseW = driversLicense;

        String lastName = String.valueOf(driversLicenseW.getSoundexCode());
        String firstNameMiddleInitial = String.valueOf(driversLicenseW.getFirstNameMiddleInitial());
        String birthYear = String.valueOf(driversLicenseW.getBirthYear());
        String monthDayGender = String.valueOf(driversLicenseW.getBirthMonthDayGender());
        String overflow = String.valueOf(driversLicenseW.getOverflow());

        String yearFirstDigit = String.valueOf(driversLicenseW.getBirthYear() / 10);
        String yearSecondDigit = String.valueOf(driversLicenseW.getBirthYear() % 10);

    // returns format of driver's license in the format of SSSS-FFFY-YDDD-N

        return lastName + "-" + firstNameMiddleInitial + yearFirstDigit + "-" + yearSecondDigit + monthDayGender + "-" + overflow;
    }
}
