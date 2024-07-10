package se.lexicon;


import se.lexicon.Dao.Person;
import se.lexicon.model.PersonIdSequencer;

public class App {
    public static void main( String[] args ) {

        int PersonIdSequencer = 0;
        System.out.println(PersonIdSequencer);

        Person person1 = new Person(0,"John","Smith","smith@gmail.com");

        System.out.println(person1);


    }
}
