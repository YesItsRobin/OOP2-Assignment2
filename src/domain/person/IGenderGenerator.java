package domain.person;

public interface IGenderGenerator {
    public Person.Gender generateGender(Species species);
}
