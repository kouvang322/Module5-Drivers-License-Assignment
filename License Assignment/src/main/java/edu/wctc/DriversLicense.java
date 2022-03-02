package edu.wctc;

public class DriversLicense {
    private String soundexCode;
    private int firstNameMiddleInitial;
    private int birthYear;
    private int birthMonthDayGender;
    private int overflow;


    public DriversLicense(String fn, String mi, String ln, int year, int month, int day, char gender)throws MissingNameException, InvalidBirthdayException, UnknownGenderCodeException {
        FirstNameUtility fNU = new FirstNameUtility();
        LastNameUtility lNU = new LastNameUtility();
        MonthDayGenderUtility mDGU = new MonthDayGenderUtility();


        setFirstNameMiddleInitial(fNU.encodeFirstName(fn, mi));
        setSoundexCode(lNU.encodeLastName(ln));
        setBirthMonthDayGender(mDGU.encodeMonthDayGender(year, month, day, gender));

        setBirthYear(year % 100);

        setOverflow(0);
    }

    public String getSoundexCode() {
        return soundexCode;
    }

    public void setSoundexCode(String soundexCode) {
        this.soundexCode = soundexCode;
    }

    public int getFirstNameMiddleInitial() {
        return firstNameMiddleInitial;
    }

    public void setFirstNameMiddleInitial(int firstNameMiddleInitial) {
        this.firstNameMiddleInitial = firstNameMiddleInitial;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonthDayGender() {
        return birthMonthDayGender;
    }

    public void setBirthMonthDayGender(int birthMonthDayGender) {
        this.birthMonthDayGender = birthMonthDayGender;
    }

    public int getOverflow() {
        return overflow;
    }

    public void setOverflow(int overflow) {
        this.overflow = overflow;
    }
}
