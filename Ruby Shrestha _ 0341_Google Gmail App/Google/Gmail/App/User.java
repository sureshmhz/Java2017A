package Google.Gmail.App;

/**
 * Created by Ruby Shrestha on 4/2/2015.
 * Roll Number : 0341
 * Section: A Batch 2017
 */

public class User {
    private String userName, gender, password;
    public String phoneNum, firstName, lastName;
    private Contact[]userContacts=new Contact[100];
    private Email[] userEmails= new Email[1000];
    int numContact=0, numMail=0;

    public boolean verifyGender(String gender){
        if (gender.toLowerCase().equals("female") || gender.toLowerCase().equals("male") || gender.toLowerCase().equals("others")) {
            this.gender = gender;
            return true;
        }

        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public boolean validateUserName(String userName){
        int i;
        boolean valid=true;
        char eachLetter;
        userName=userName.toLowerCase();
        for (i=0; i<userName.length(); i++){
            eachLetter=userName.charAt(i);
            if (!(((int)eachLetter>=97 && (int)eachLetter<=122) || eachLetter=='.' || ((int)eachLetter>=48 && (int)eachLetter<57))){
                valid=false;
                break;
            }
        }
        if (valid==true)
            this.userName = userName + "@gmail.com";

        return valid;
    }


    public  String getFullName(){
        return this.firstName+ this.lastName;
    }

    public Contact[] getContactList(){
        return userContacts;
    }

    public Email[] getUserEmails(){
        return userEmails;
    }

    public void addContact(Contact c1){
        userContacts[numContact]=c1;
        numContact++;
    }

    public void addToMailList(Email e){
        userEmails[numMail]=e;
        numMail++;
    }

    String getUserDetails(){
        return "\n\nUserDetails-----------------\nName: " + this.getFullName() + "\nGender: " + this.gender + "\nPhone: " + this.phoneNum + "\nUsername: " + this.getUserName();
    }

}
