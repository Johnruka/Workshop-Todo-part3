package se.lexicon.model;

public class AppointmentIdSequencer {

    private static int sequencer = 0;

    private final int currentId;

    int nextId() {
        return 0;
    }

    public AppointmentIdSequencer(int currentId) {
        this.currentId = getNextId();

    }

    public int getCurrentId() {
        return currentId;
    }

    public int setCurrentId(int currentId) {
        return currentId;
    }


    private static int getNextId() {
        return ++sequencer;
    }
}