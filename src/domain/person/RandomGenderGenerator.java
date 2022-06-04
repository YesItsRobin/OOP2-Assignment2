package domain.person;

import java.util.Random;

public class RandomGenderGenerator implements IGenderGenerator{
    @Override
    public Person.Gender generateGender(Species species) {
        Random r = new Random();
        if (r.nextInt(4) == 0) {
            return Person.Gender.MALE;
        }
        if (r.nextInt(3) == 1) {
            return Person.Gender.FEMALE;
        }
        if (r.nextInt(10) <= 8) {
            return Person.Gender.UNKNOWN;
        }
        else {
            return Person.Gender.OTHER;
        }
    }
}
