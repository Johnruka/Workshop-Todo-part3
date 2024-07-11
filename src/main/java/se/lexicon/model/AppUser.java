package se.lexicon.model;

import java.util.Objects;

public class AppUser {

    static String username;
    static String password;
    AppRole role;
    String user;

    public AppUser(String username, String password, AppRole role) {
        setUsername(username);
        setPassword(password);
        setRole(role);


    }

    public static String getUsername() {
        return username;
    }

    public static void remove(AppUser appUser) {

    }


    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty())
            throw new IllegalArgumentException("username is null or empty.");
        AppUser.username = username;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) throws IllegalArgumentException {
        if (password == null || password.trim().isEmpty())
            throw new IllegalArgumentException("password is null or empty.");
        AppUser.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("role is null or empty.");

        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, username) && role == AppRole.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}

