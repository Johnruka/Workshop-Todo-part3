package se.lexicon.Dao;

import java.util.Collection;
import java.util.List;

public class AppUserDaoCollection implements AppUserDao {
    @Override
    public Person persist() {
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return List.of();
    }

    @Override
    public Void remove() {
        return null;
    }
}
