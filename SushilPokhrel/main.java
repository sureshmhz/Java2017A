/**
 * Created by Sushil on 4/2/2015.
 */
import java.util.Scanner;
public class main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Login l = new Login();
        System.out.println("Enter Phone Number");
        l.phonenumber = input.nextDouble();
        System.out.println("Your pin is "+ l.togenerateCode());
        Currentbalance c  = new Currentbalance();
        c.showCurrentbalance();
        c.Recharge();
        DataPackusuage d = new DataPackusuage();
        d.showDataPackUsuage();
        SpecialOffer s = new SpecialOffer();
        s.offername= " Weekly";
        s.showOffer();
    }
}
