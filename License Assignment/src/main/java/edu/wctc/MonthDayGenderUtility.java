package edu.wctc;

import javax.lang.model.element.UnknownAnnotationValueException;
import java.time.LocalDate;

public class MonthDayGenderUtility {
    private	final int	MOD_MALE = 0;
    private	final int	MOD_FEMALE = 500;
    private	final char	CODE_MALE = 'M';
    private	final char	CODE_FEMALE = 'F';


    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException
    {
        // can throw two exceptions
        int numForGender = MOD_MALE;

        // need to test valid date using user input
    try{
        LocalDate validDate = LocalDate.of(year, month, day);
    }
    catch(Exception exception){
        throw new InvalidBirthdayException(year, month, day);
    }


        if(genderCode != CODE_MALE && genderCode != CODE_FEMALE){
            throw new UnknownGenderCodeException(genderCode);
        }
        else if(genderCode == CODE_FEMALE){
            numForGender = MOD_FEMALE;
        }

        return ((month - 1) + 40) + day + numForGender;
    }
}
