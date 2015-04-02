package com.company;

import java.util.Scanner;

/**
 * Created by razor on 4/2/2015.
 */
public class Button {
    Scanner scan1 = new Scanner(System.in);
    int opt = scan1.nextInt();

    public void toggle() {
        switch (opt) {
            case 1:
                System.out.println("The flashlight is on");
                break;
            case 2:
                System.out.println("The flashlight is off");

        }

    }
}