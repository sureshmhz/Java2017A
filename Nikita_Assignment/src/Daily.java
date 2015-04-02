import java.util.Scanner;

/**
 * Created by deepak on 4/2/15.
 */
public class Daily {
    Scanner input = new Scanner(System.in);
    public int num;
    public int select;
    public void selectHoroscope ()
    {
        System.out.println("!!!!SELECT YOUR HOROSCOPE!!!!");
        System.out.println("1.Aries");
        System.out.println("2.Taurus");
        System.out.println("3.Gemini");
        System.out.println("4.Cancer");
        System.out.println("5.Leo");
        System.out.println("6.Virgo");
        System.out.println("7.Libra");
        System.out.println("8.Scorpio");
        System.out.println("9.Sagittarius");
        System.out.println("10.Capricorn");
        System.out.println("11.Aquarius");
        System.out.println("12.Pisces");
        System.out.println("\n");
        System.out.print("-->");
        select = input.nextInt();
        SelectText text = new SelectText();
        text.horoscopeToday(select);
    }
}
