package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {


    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        DriversLicense driversLicenseF = driversLicense;

        String lastName = String.valueOf(driversLicenseF.getSoundexCode());
        String firstNameMiddleInitial = String.valueOf(driversLicenseF.getFirstNameMiddleInitial());
        String birthYear = String.valueOf(driversLicenseF.getBirthYear());
        String monthDayGender = String.valueOf(driversLicenseF.getBirthMonthDayGender());
        String overflow = String.valueOf(driversLicenseF.getOverflow());

        // returns format of driver's license in the format of SSSS-FFF-YY-DDD-N
        // this needs logic to format the values that are given

        return lastName+ "-" + firstNameMiddleInitial + "-" + birthYear + "-" + monthDayGender + "-" + overflow;
    }
}
