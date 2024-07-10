package se.lexicon.model;

import java.util.Objects;
import java.util.UUID;

public class AutoExpert {

    private int id;
    private boolean assigned;
    private Appointment appointment;
    private Person assignee;

    public AutoExpert(int id) {
        this.id = Integer.parseInt(UUID.randomUUID().toString());
        this.appointment = Objects.requireNonNull(appointment, "AppointmentInfo cannot be null");
        this.assigned = true;

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

    public Person setAssignee(Person assignee) {
        return assignee;
    }

    public String getAssigneeInformation() {
        String creatorInfo = appointment != null ? " PersonId: " + appointment.getId() : "-";
        return String.format("AssigneeInformation{ id=%s, ChangeTires=%s, done=%b, creator=%s }", id, creatorInfo);
    }
}
