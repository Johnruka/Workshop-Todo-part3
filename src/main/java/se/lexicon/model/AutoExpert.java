package se.lexicon.model;

import java.util.Objects;
import java.util.UUID;

public class AutoExpert {

    private static int id;
    private boolean assigned;
    private static Appointment appointment;
    private Person assignee;

    public AutoExpert(int id, Appointment appointment, Person assignee) {
        this.id = Integer.parseInt(UUID.randomUUID().toString());
        this.appointment = Objects.requireNonNull(appointment, "AppointmentInfo cannot be null");
        this.assigned = true;

    }
    public AutoExpert(int id) {
        this.id = id;

}

    public int getId() {
        return id;
    }

    public boolean setAssigned(boolean assigned) {
        return assigned;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public Appointment setAppointment(Appointment appointment) {
        return appointment;
    }

    public Person getAssignee() {
        return assignee;
    }

    public static String setAssignee(String assignee) {
        return assignee;
    }

    public static String getAssigneeInformation() {
        String creatorInfo = appointment != null ? " PersonId: " + appointment.getId() : "-";
        return String.format("AssigneeInformation{ id=%s, ChangeTires=%s, done=%b, creator=%s }", id, creatorInfo);
    }
}
