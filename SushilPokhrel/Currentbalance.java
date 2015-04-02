/**
 * Created by Sushil on 4/2/2015.
 */
import java.util.Scanner;
public class Currentbalance {
    Scanner input = new Scanner(System.in);
    double Currentbalance = 8;
    void showCurrentbalance(){
        System.out.println("Current Balance\n"+Currentbalance);
    }
    void Recharge(){
        double num;
        System.out.println("Enter the pin number of your card");
        num = input.nextDouble();
        System.out.println("Your account is sucessfully recharged");
    }
}
