package Google.Gmail.App;

/**
 * Created by Ruby Shrestha on 4/2/2015.
 * Roll Number : 0341
 * Section: A Batch 2017
 */
public class Contact extends User {
    String address, groupName, circle;

    boolean validateCircle(String circle){
        if (circle.toLowerCase().equals("friends") || circle.toLowerCase().equals("family") || circle.toLowerCase().equals("acquaintances") || circle.toLowerCase().equals("following" )){
            this.circle=circle;
            return true;
        }
        else
            return false;
    }

    String getContactDetails(){
        return "Name: " + super.getUserName()+ "\nAddress: " + this.address + "\nUsername: " + super.getUserName() + "\nBelongs to group: " + this.groupName + "\nOf Contact Circle: "+ this.circle;
    }

}
