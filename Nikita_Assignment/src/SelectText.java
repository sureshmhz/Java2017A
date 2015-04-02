/**
 * Created by deepak on 4/2/15.
 */
public class SelectText {
    String sign, text;
    String[] name = {"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius","Pisces"};

    public void horoscopeToday (int select)
    {
          switch(select)
          {
              case 1:
                  sign = name[0];
                  text = "You need to keep yourself physically busy today.";
                  displayHoroscope(sign,text);
                  break;
              case 2:
                  sign =  name[1];
                  text = "Don't cling to your own ideas today.";
                  displayHoroscope(sign,text);
                  break;
              case 3:
                  sign =  name[2];
                  text = "You will be able to adapt to any situations.";
                  displayHoroscope(sign,text);
                  break;
              case 4:
                  sign =  name[3];
                  text = "You will have to make emotional commitment of some kind today.";
                  displayHoroscope(sign,text);
                  break;
              case 5:
                  sign =  name[4];
                  text = "Your opinions may alter today by a close friend or relative. ";
                  displayHoroscope(sign,text);
                  break;
              case 6:
                  sign =  name[5];
                  text = "You will be in a day dreamy mood today.";
                  displayHoroscope(sign,text);
                  break;
              case 7:
                  sign =  name[6];
                  text = "Life is more than just work. So, you will be exploring today.";
                  displayHoroscope(sign,text);
                  break;
              case 8:
                  sign =  name[7];
                  text = "Your emotional attachments may seem to betray you today. Be careful.";
                  displayHoroscope(sign,text);
                  break;
              case 9:
                  sign =  name[8];
                  text = "Someone within your friend or family circle will bring good news to you.";
                  displayHoroscope(sign,text);
                  break;
              case 10:
                  sign =  name[9];
                  text = "You will get what you want but you need to handle many tasks at a time today.";
                  displayHoroscope(sign,text);
                  break;
              case 11:
                  sign =  name[10];
                  text = "You will be dealing with annoying person or situation today.";
                  displayHoroscope(sign,text);
                  break;
              case 12:
                  sign =  name[11];
                  text = "Don't hold back your emotions. It will cause you great trouble if you do so today.";
                  displayHoroscope(sign,text);
                  break;
          }
    }

    public void displayHoroscope (String sign, String text )
    {
        System.out.println("----- YOUR HOROSCOPE -----\n");
        GenerateRandom rand = new GenerateRandom();
        System.out.print("DATE:: ");
        rand.date();
        System.out.println("SIGN:: "+sign);
        System.out.println("HOROSCOPE TODAY:: "+text);

    }

}
