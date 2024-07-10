package se.lexicon.Dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDaoCollection implements PersonDao {

    List<Person> PersonArrayList = new ArrayList<>();



    @Override
    public Person persist() {
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        ArrayList<Person> copyPersonList = new ArrayList<>(PersonArrayList);
        return copyPersonList();
    }

    private Collection<Person> copyPersonList() {
        return copyPersonList();
    }

    @Override
    public Void remove() {
        return null;
    }
}
