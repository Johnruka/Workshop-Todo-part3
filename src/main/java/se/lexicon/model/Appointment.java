package se.lexicon.model;

import se.lexicon.Dao.Sequencer.AppointmentSequencer;

import java.time.LocalDate;

public class Appointment {

    private final int id;
    private String ChangeTires;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public Appointment(int id, String ChangeTires, LocalDate deadLine) {
        this.id = AppointmentSequencer.nextId();
        this.ChangeTires = ChangeTires;
        this.deadLine = deadLine;

    }

    public Appointment(int id) {
        this.id = id;
    }

    public int getId() {
        return AppointmentSequencer.nextId();
    }


    public String getChangeTires() {
        return ChangeTires;
    }


    public void setChangeTires(String changeTires) {
        if (ChangeTires == null) throw new IllegalArgumentException("Change tires cannot be null");
        this.ChangeTires = ChangeTires;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean setDone(boolean done) {
        return done;
    }

    public Person getCreator() {
        return creator;
    }

    public boolean setCreator(boolean Overdue) {
        return Overdue;
    }

    public String getSummery(String summery) {
        return summery;
    }

    public String getAppointmentInformation() {
        String creatorInfo = creator != null ? " PersonId: " + creator.getId() : "-";
        return String.format("Appointment{ id=%s, ChangeTires=%s, done=%b, creator=%s }", id, ChangeTires, done, creatorInfo);

    }

    public String isAvailable() {
        String isAvailable = "isavailabe";
        return isAvailable;
    }

    public Object setAssignee(String assignee) {
        Object setAssignee = null;
        return setAssignee;
    }
}
