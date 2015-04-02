package Javaassigment.Assignment;

import java.util.Scanner;

/**
 * Created by CRANK on 4/2/2015.
 */
public class Tank
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Press 1 to move up");
        System.out.println("Press 2 to move down");
        System.out.println("Press 3 to move left");
        System.out.println("Press 4 to move right");
        System.out.println("Press 0 to fire");
        int i=0;
        Observe.observe();
        while(i<4)
        {
        int userInput=input.nextInt();
            if(userInput==1)
            {
                Moveup.controlup();
                if(random1==random2)
                {
                    System.out.println("Alert target found hit 0");
                    int Input=input.nextInt();
                    if(Input==0)
                    {
                        Shoot.shoot();
                        Destructed.destroyed();
                    }
                    break;
                }

            }

                if(userInput==2)
                {
                    Movedown.controldown();
                    if(random1==random2)
                    {
                        System.out.println("Alert target found hit 0");
                        int Input=input.nextInt();
                        if(Input==0)
                        {
                            Shoot.shoot();
                            Destructed.destroyed();
                        }
                        break;
                    }
                }
                if(userInput==3)
                {
                    Moveleft.controlleft();
                    if(random1==random2)
                    {
                        System.out.println("Alert target found hit 0");
                        int Input=input.nextInt();
                        if(Input==0)
                        {
                            Shoot.shoot();
                            Destructed.destroyed();
                        }
                        break;
                    }
                }
                if(userInput==4)
                {
                    Moveright.controlright();
                    if(random1==random2)
                    {
                        System.out.println("Alert target found hit 0");
                        int Input=input.nextInt();
                        if(Input==0)
                        {
                            Shoot.shoot();
                            Destructed.destroyed();
                        }

                        break;
                    }

                }
            else
                    System.out.println("Target accquired press fire");
            int Input=input.nextInt();
            if(Input==0)
            {
                Shoot.shoot();
                Destructed.destroyed();
            }


        i++;
        }


    }
    static int randomnumber()
    {
      int random=0;
        random=(int)(Math.random()*10);
        return random;
    }
    static int random1=randomnumber();
    static int random2=randomnumber();


}

class Moveup
{
   public static void controlup()
   {
       System.out.println("you've moved up");
   }
}
class Movedown
{
   public static void controldown()
   {
       System.out.println("you've moved down");
   }
}
class Moveleft
{
    public static void controlleft()
    {
        System.out.println("you have moved left");
    }
}
class Moveright
{
   public static void controlright()
   {
       System.out.println("you've moved right");
   }
}
class Shoot
{
   public static void shoot()
   {
       System.out.println("you've fired");
   }
}
class Observe
{
    public static void observe()
    {
        System.out.println("Now you're searching your opponents");
    }
}

class Destructed
        {
        public static void destroyed()
        {
            System.out.println("opponent terminated");
        }
        }