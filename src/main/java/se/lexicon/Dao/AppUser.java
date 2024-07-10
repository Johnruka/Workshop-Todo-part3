package se.lexicon.Dao;

public class AppUser {

    static String username;
    static String password;
    AppRole role;
    String user;

    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.user = getUsername();
    }

    private String getUsername() {
        return username;
    }
}