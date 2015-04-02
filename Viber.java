/**
 * Created by Barssha on 4/2/2015.
 */
public class Viber {
        public static void main(String[] args) {

            ViberUser user = new ViberUser();
            user.Access() {
                user.sync = "";
                user.country = "";
                user.phone = "";
                user.accesscode = "";
            };
            ViberProfile profile = new ViberProfile();
            profile.creatProfile;
            profile.addContacts();

            ViberMsg msg = new ViberMsg();
            msg.msgViber();
            msg.groupMsg();

            ViberCall call = new ViberCall();
            call.callViber();
            call.viberoutCall();
        }
    }
class ViberUser{
    String country;
    int phone;
    int accesscode;

    Access(){} // Give access to the new users
}

class ViberProfile{
    creatProfile(){} //Show your dp and info
    addContacts(){} //add contacts
}

class ViberMsg{
    MsgViber(){} //Send text to the viber users who are in our contact list
    groupMsg(){}//we can creat a group and sent msg
}

class ViberCall{
    callViber(){} //free call your friends
    viberoutCall(){} //call people who are not in viber
}
