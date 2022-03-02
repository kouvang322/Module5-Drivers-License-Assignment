package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private Soundex soundex;

    public String encodeLastName(String lastName) throws MissingNameException {
       //if last name is empty return missing name exception
        // otherwise convert name using soundex to get code
        soundex = new Soundex();
        String soundexCode;

        if(lastName.equals(""))
        {
            throw new MissingNameException("Last Name");
        }
        else {
            soundexCode = soundex.encode(lastName);
        }
        return soundexCode;
    }
}
