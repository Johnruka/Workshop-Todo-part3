package se.lexicon.model;

import java.util.Arrays;

public class Person {

    private final int id;
    public Object setAssigned;
    private String firstName;
    private String lastName;
    private String email;
    private Person person;
    private boolean done;

    private int[] AssignedAppointments;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.AssignedAppointments = new int[0];
        this.person = person;


    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("FirstName cannot be null");
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("LastName cannot be null");
        this.lastName = lastName;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email cannot be null");
        this.email = email;

    }

    public int getId() {
        return id;

    }

    public String getPersonInformation() {
        return "Person{ id=" + id + ", firstName='" + firstName + ", lastName='" + lastName +
                ",email='" + email;


    }

    public String getSummary(String summary) {
        return summary;
    }


    public String getAssigneeInformation() {
        return "person{ id=" + id + ", firstName='" + firstName + ", lastName='" + lastName +
                ",email='" + email;
    }

    public String setAssigned(String assigned) {
        return assigned;

    }

    public void setAssignee(String appointment) {
        int[] newArray = Arrays.copyOf(AssignedAppointments(), AssignedAppointments().length + 1);
        int Appointment = 0;
        newArray[newArray.length - 1] = Appointment;
        AssignedAppointments = newArray;


    }

    private int[] AssignedAppointments() {
        return new int[0];
    }
}




