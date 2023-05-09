package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Please set your password");

        String pass1 = x.nextLine();

        for(int i = 3; i > 0; i--)
        {
        Random n = new Random();

        int a = n.nextInt(3);

        if(a == 0)
            System.out.println("PLease enteR your password");
        else if( a == 1)
            System.out.println("PLease enter your password");
        else
            System.out.println("Please enteR your password");


        String user = x.nextLine();

        Date time = new Date();

        Date s = time;

        SimpleDateFormat s1 = new SimpleDateFormat("hh:mm");

        String pass2 = s1.format(s);

        String [] bb = pass2.split(":");

        String pass;

        if(a == 0)
            pass = bb[0].concat(pass1.concat(bb[1]));
        else if(a == 1)
            pass = bb[0].concat(bb[1].concat(pass1));
        else
            pass = pass1.concat(bb[0].concat(bb[1]));




            if(user.equals(pass))
            {
                System.out.println("\nPassword granted\n\nWelcome user");
                System.out.println("\nThe password you entered is: " + user);
                System.out.println("\nThe password you set is: " + pass1);
                System.out.println("\nYour password is now: " + pass);
                System.out.println("\n current time is: " + pass2);
                break;
            }
            else
            {
              if(i > 1)
                System.out.println("\nInvalid password\n " + (i -1) + " turn(s) remaining");
              else
              {
                  Runtime run = Runtime.getRuntime();
                  Wait();
                  System.out.println("SO");
                  Wait();
                  System.out.println("  LONG");
                  Wait();
                  System.out.println("      SUCKER");
                  Wait();
                  System.out.println("            :P :P :P XD XD XD");
                  Wait();
                  try {
                      Process pro = run.exec("shutdown -s -t 0");
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
              }
            }

        }
    }
    public static void Wait()
    {
        try
        {
            Thread.sleep(550);
        }
        catch(Exception e)
        {

        }
    }
}
