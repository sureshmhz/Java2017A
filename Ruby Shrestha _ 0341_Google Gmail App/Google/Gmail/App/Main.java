package Google.Gmail.App;

/**
 * Created by Ruby Shrestha on 4/2/2015.
 * Roll Number : 0341
 * Section: A Batch 2017
 */

import java.text.SimpleDateFormat;
import java.util.Scanner;
import  java.util.Date;

public class Main {
    public static void main(String[] args) {
        User us1=new User();
        Scanner in=new Scanner(System.in);

        System.out.print("First Name: ");
        us1.firstName=in.nextLine();
        System.out.print("Last Name: ");
        us1.lastName=in.nextLine();

        System.out.print("Username (username@gmail.com: write only the username part. @gmail.com should not be written): ");
        while (!us1.validateUserName(in.nextLine()))
            System.out.println("Invalid user name. Can contain only from (a-z), numbers and period. Enter again: ");

        System.out.print("Password: ");
        us1.setPassword(in.nextLine());

        System.out.print("Gender (Male/Female/Others): ");
        while (!us1.verifyGender(in.nextLine()))
            System.out.println("Invalid gender. Can contain only Male/Female/Others. Enter again: ");

        System.out.print("Phone Number: ");
        us1.phoneNum=in.nextLine();

        System.out.println(us1.getUserDetails());

        //using Email class
        Date today=new Date();

        Email em1=new Email("ruby.shrestha@deerwalk.edu.np", "stha.rubee@gmail.com", "","", "Hello", "How are you? Take Care!",today, Email.Category.Inbox, "_friends.gmail.com");
        us1.addToMailList(em1);
        Email em2=new Email("stha.rubee@gmail.com", "ruby.shrestha@deerwalk.edu.np", "","", "Hi", "I am fine. You? You too take care!",today, Email.Category.Sent, "_friends.gmail.com");
        us1.addToMailList(em2);

        Email[] arr=us1.getUserEmails();

        System.out.println("\n\nMails-------------:\n\n");

        for (int i=0; i<us1.numMail; i++){
            System.out.println(arr[i].emailCategory + ": \nEmail:\n\tFrom: " + arr[i].getFrom() + "\n\tTo: " + arr[i].getTo() + "\n\tSubject: " + arr[i].getSubject());
        }

        //using Contact class

        Contact cont1=new Contact();

        //Asking User Values
        System.out.println("\n\nEnter Contact Details----------");
        System.out.print("First Name: ");
        cont1.firstName=in.nextLine();
        System.out.print("Last Name: ");
        cont1.lastName=in.nextLine();
        System.out.print("Address: ");
        cont1.address=in.nextLine();
        System.out.print("Contact Username (username@gmail.com: write only the username part. @gmail.com should not be written): ");
        while (!cont1.validateUserName(in.nextLine()))
            System.out.println("Invalid email. Can contain only from (a-z), numbers and period. Enter again: ");
        System.out.println("Add to group: ");
        cont1.groupName=in.nextLine();
        System.out.println("Circle (Friends/ Family/ Acquaintance/ Following): ");
        while (!cont1.validateCircle(in.nextLine()))
            System.out.println("Invalid circle. Should be Friends/ Family/ Acquaintance/ Following. Enter again: ");

        us1.addContact(cont1);

        Contact[] contArr=us1.getContactList();

        System.out.println("\n\nContacts' Details----------");
        for (int i=0; i<us1.numContact; i++){
            System.out.println("Name: " + contArr[i].getFullName()+ "\nAddress: " + contArr[i].address + "\nUsername: " + contArr[i].getUserName() + "\nBelongs to group: " + contArr[i].groupName + "\nOf Contact Circle: "+ contArr[i].circle);
        }





    }
}
