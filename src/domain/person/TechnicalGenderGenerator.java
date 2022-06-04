package domain.person;

import domain.planet.TechnicalLevel;

import java.util.Random;

public class TechnicalGenderGenerator implements IGenderGenerator{
    @Override
    public Person.Gender generateGender(Species species) {
    TechnicalLevel lvl = species.getTechnicalLevel();
    if (lvl==TechnicalLevel.MOREADVANCED){
        return Person.Gender.OTHER;
    }
        Random r = new Random();
        int x=r.nextInt(10);
        if (lvl==TechnicalLevel.FASTERTHANLIGHT || lvl==TechnicalLevel.GATEUSER){
            if (x<=1){
                return Person.Gender.OTHER;
            }
            else if(x<=3){
                return Person.Gender.UNKNOWN;
            }
            else if(x<=6){
                return Person.Gender.FEMALE;
            }
            return Person.Gender.MALE;
        }
        if (x==0){
            return Person.Gender.OTHER;
        }
        else if(x==1){
            return Person.Gender.UNKNOWN;
        }
        else if(x<=5){
            return Person.Gender.FEMALE;
        }
        return Person.Gender.MALE;
    }
}
