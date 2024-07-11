package se.lexicon.Dao;




import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;



public class AppUserDaoCollection implements AppUserDao {

    private final List<AppUser> appUsers;

    //create an object of SingleObject
    private static AppUserDaoCollection instance;

    //make the constructor private so that this class cannot be instantiated
    private AppUserDaoCollection() {
        appUsers = new ArrayList<>();


    }


    @Override
    public AppUser persist(AppUser appUser) {
        if (findByUsername(AppUser.getUsername()) != null) {
            throw new IllegalArgumentException("Username " + AppUser.getUsername() + " is already taken");
        }
        if (!appUsers.contains(appUser)) {
            appUsers.add(appUser);
        }
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser appUser : appUsers) {
            if (AppUser.getUsername().equals(username)) {
                return appUser;
            }
        }
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return new ArrayList<>(appUsers);
    }

    @Override
    public void remove(String username) {
        AppUser appUser = findByUsername(username);
        if (appUser != null) {
            appUsers.remove(appUser);

        }
    }
}













