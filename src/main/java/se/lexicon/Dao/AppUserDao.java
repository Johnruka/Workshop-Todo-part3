package se.lexicon.Dao;

import java.util.Collection;

public interface AppUserDao {

    Person persist();

    Person findById = null;
    Person findByEmail = null;

    Collection<Person> findAll();

    Void remove();
}
