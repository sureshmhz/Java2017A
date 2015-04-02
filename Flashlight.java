package com.company;

import java.util.Scanner;

public class Flashlight {

    public static void main(String[] args) {
	// write your code here
        Scanner ScanTouch=new Scanner(System.in);
        int choice=ScanTouch.nextInt();
        Settings click=new Settings();
        Button tab=new Button();

        if(choice==1)
        {
            click.Change();
        }

        if(choice==2)
        {
            tab.toggle();
        }
    }
}
