package domain.person;

import java.time.LocalDate;

public class GenderFactory {
    public static Person.Gender getGender(Species species, LocalDate dateOfBirth){
        IGenderGenerator genderGenerator=null;
        if(dateOfBirth==null){
            genderGenerator=new TechnicalGenderGenerator();
        }
        else if(dateOfBirth.isLeapYear()){
            genderGenerator=new RandomGenderGenerator();
        }
        else {
            genderGenerator=new ClimateGenderGenerator();
        }
        return genderGenerator.generateGender(species);
    }
}
