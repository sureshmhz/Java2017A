
import java.util.Date;


public class NepaliPatro {
    public static void main(String[] args) {
        Date date = new Date(); // pass current date, or a date selected by the user.
        Calender calender = new Calender(date); // create calender object of that particular date.
        calender.show(); // show the calender.
        Events event = new Events(); // create events object.
        event.showEvents(calender); // Get Events
        event.showDetails("Dashain"); // In the case when user clicks on a particular event, show its details.
        Raasiphal raashiphal = new Raasiphal("Mithun"); // create raashiphal object
        raashiphal.getData(); // get it's raashiphal.
    }
}


class Calender{
    private Date currentDate;

    Calender(Date date){
        setCurrentDate(date);
    }

    public String show(){
        return "Calender of current date." + getCurrentDate(); // show calender of current date.
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date date){
        this.currentDate = date;
    }
}

class Events{

    public String showEvents(Calender calender){
        // do calender.getCurrentdate();
        // get the date
        // and return the events of that particular date.
        return "Events";
    }

    public String showDetails(String name){
        // return details of events based on the name.
        return "Details: ";
    }

}


class Raasiphal{
    private String raashi;

    Raasiphal(String raashi){
        updateData(); // if the data is old, update the data by grabbing the latest info.
        this.raashi = raashi;

    }

    void updateData(){
        // make request and get the latest data.
        // store the retrieved data locally.
    }

    public String getData(){
        // search the updated data (locally stored) for info of a specific raashi class variable.
        return "Raasiphal of: " + raashi + " is: " ; // return it.

    }
}