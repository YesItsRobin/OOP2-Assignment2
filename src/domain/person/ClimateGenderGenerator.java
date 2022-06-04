package domain.person;

import domain.planet.Climate;

import java.util.Random;

import static domain.person.Person.Gender.MALE;

public class ClimateGenderGenerator implements IGenderGenerator{

    @Override
    public Person.Gender generateGender(Species species) {
        Random r = new Random();
        Climate climate = species.getPreferredClimate();
        if (climate == Climate.ARCTIC){
            if (r.nextInt(11)>=10){
                return MALE;
            }
            return Person.Gender.FEMALE;
        }
        else if(climate == Climate.TROPICAL){
            if(r.nextInt(2)==1){
                return MALE;
            }
            return Person.Gender.FEMALE;
        }
        else if(climate == Climate.OCEAN){
            if(r.nextInt(11)>=10){
                return Person.Gender.FEMALE;
            }
            return Person.Gender.MALE;
        }
        return Person.Gender.UNKNOWN;
    }
}
