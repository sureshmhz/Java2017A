/**
 * Created by sneha on 2015-04-02.
 */

public class GoogleKeep {

    public static void main(String[] args) {
        // write your code here\
        Notes c1=new Notes();
        c1.noteType();
        c1.noteCreate();

        Reminder s1=new Reminder();
        s1.setTime();
        s1.Notify();

    }
}
public class Notes {
    Scanner Scan=new Scanner(System.in);
    int choice= Scan.nextInt();
    void noteType(){
        //chooses the type of note to create;
        //picture notes, voice notes, lists etc
    }
    void noteCreate(){
        //create note after choosing the type
    }

    void noteDelete(){
        //delete the notes
    }
}

public class Reminder {
    void setTime(){
        // set time for notifying
    }
    void Notify(){
        // display or outputs the notes in set time
    }

}


