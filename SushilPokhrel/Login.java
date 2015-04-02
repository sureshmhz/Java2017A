/**
 * Created by Sushil on 4/2/2015.
 */
public class Login {
    double phonenumber;
    int togenerateCode(){
        int code = (int) (Math.random()*1000);
        return code;
    }
    void toSendCode(){
        System.out.println("Send " +togenerateCode() + " to " + phonenumber );
    }
}
