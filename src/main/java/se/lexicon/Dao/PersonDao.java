package se.lexicon.Dao;

import se.lexicon.model.Person;

import java.util.Collection;

public interface PersonDao {
    Person persist();
    Person findById = null;
    Person findByEmail = null;
    Collection<Person> findAll();
    Void remove();
}
