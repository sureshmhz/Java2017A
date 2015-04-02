/**
 * Created by Bikash on 2/04/2015.
 */
public class main {
    public static void main(String[] args){

    String date = null;
    Routine ro1 = new Routine();
    Reminder rem1 = new Reminder();

    ro1.setRotine();
    ro1.deleteRoutine();
    ro1.nextDayRoutine();
    ro1.showRoutine(date);
    ro1.showToday();
    ro1.thisTime();

    rem1.setTime();
    rem1.setNotes();
    rem1.ring();
    rem1.snooze();
    rem1.stopReminder();

    }
}
