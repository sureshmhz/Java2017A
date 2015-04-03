import java.util.*;
public class Share{

    public static void main(String[]args){


        String email;
        String msg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the message to share");
        msg = input.nextLine();
        System.out.println("Enter the email");
        email = input.nextLine();

        ShareviaEmail newShareObj = new ShareViaEmail();
        if(newShareObj.ShareText(msg, email)){
            System.out.println("Message shared successfully");
        }
        else{
            System.out.println("Message not shared");
        }


    }
}

class ShareViaEmail{
    boolean ShareText(String message, String toEmail){

    }

    boolean ShareImage(String toEmail){

    }

    boolean ShareVideo(string toEmail){

    }
}


class ShareviaMessage{
    boolean ShareText(String message, String toNumber){

    }

    boolean ShareMultiMedia(String toNumber){

    }
}