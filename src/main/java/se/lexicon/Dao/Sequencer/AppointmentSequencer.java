package se.lexicon.Dao.Sequencer;

public class AppointmentSequencer {

    private static int sequencer = 0;

    public static int nextId() {
        return ++sequencer;
    }
}
