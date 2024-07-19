package se.lexicon;


import se.lexicon.Dao.Sequencer.AppointmentSequencer;
import se.lexicon.Dao.Sequencer.AutoExpertSequencer;
import se.lexicon.Dao.Sequencer.PersonSequencer;
import se.lexicon.model.*;

public class App {
    public static void main( String[] args ) {

        // Appointment
        Appointment appointment1 = new Appointment(AppointmentSequencer.nextId());
        Appointment appointment2 = new Appointment(AppointmentSequencer.nextId());

        System.out.println("Appointment information:");
        System.out.println(appointment1.getAppointmentInformation());
        System.out.println(appointment2.getAppointmentInformation());

        System.out.println(".........................");




        //Person
        Person person1 = new Person("David", "Land", "david@gmail.com");
        Person person2 = new Person("John", "Lund", "john@gmail.com");

        //Before Appointment
        System.out.println("Person information:");
        System.out.println(PersonSequencer.nextId());
        System.out.println(person1.setId(PersonSequencer.nextId()));
        System.out.println(person2.setId(PersonSequencer.nextId()));
        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());


        System.out.println("..............................");

        //AutoExpert
        Person assignee2 = person1;
        Person assignee1 = person2;

        System.out.println("Assignee information:");
        System.out.println(assignee1.getId());
        System.out.println(assignee2.getId());
        System.out.println(assignee2.getPersonInformation());
        System.out.println(assignee1.getPersonInformation());
        System.out.println("...................................");

        AutoExpert.setAssignee(String.valueOf(appointment2));

        //After Assigned
        System.out.println("person information:");

        System.out.println(".................................................");

        // User
        AppUser user1 = new AppUser("davis", "55555", AppRole.APP_USER);
        AppUser user2 = new AppUser("John", "789546", AppRole.APP_ADMIN);

        System.out.println("user information:");
        System.out.println(user1.getRole());
        System.out.println(user2.getRole());
        System.out.println();
        boolean isEqualuser1 = user1.equals(user2);
        System.out.println(isEqualuser1);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());



    }
}
