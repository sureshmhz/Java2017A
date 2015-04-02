/**
 * Created by Asmita Subedi on 4/2/2015.
 * 0346"A"
 * Creating classes, objects and methods of Skype Application
 */
public class Skype {
    public static void main(String[] args) {

        SkypeLogin login = new SkypeLogin();
            login.SignUp();

            login.SignIn(){
            login.skypename = "";
            login.password = "";};

        SkypeProfile profile = new SkypeProfile();
            profile.createProfile();
            profile.addContacts();

        SkypeCall call = new SkypeCall();
            call.callSkype();

            call.callMobile();

            call.groupCall();


        SkypeVideo video = new SkypeVideo();

            video.one_to_oneVideoCall();
            video.groupVideoCall();

        SkypeMessage message = new SkypeMessage();

            message.videoMessaging();
            message.instantMessaging();
            message.sendTexts();
            message.voiceMessaging();
            message.groupMe();


    }
}
class SkypeLogin{
    String skypename, password;

    SignUp(){} //creates a new skype user account
    SignIn(){} //verifies skypename and password
}

class SkypeProfile{
    createProfile(){} //tell who are you and how are you
    addContacts(){} //add contacts to your friends list and get connected
}

class SkypeCall{

    callSkype(){} //Call anyone else on Skype for free, anywhere in the world
    callMobile(){} //Call mobiles and landlines worldwide at low rates.
    groupCall(){} //Get a group of people together on one call – you can add up to 25 people.

}
class SkypeVideo{

    one_to_oneVideoCall(){} //Get closer with a face to face catch up
    groupVideoCall(){} //Get a group of friends together at the same time on a video call

}

class SkypeMessage{

    videoMessaging(){} //Send a message you can see, hear and feel.
    instantMessaging(){} //Talk with your fingers - gossip away, plan a trip, work on a project – all in an instant.
    sendTexts(){} // Send Text messages to your friends
    voiceMessaging(){} //If anyone is Too busy to talk? Allow Skype to take a message for you.
    groupMe(){} //Share messages, photos and your location on your mobile.
}
