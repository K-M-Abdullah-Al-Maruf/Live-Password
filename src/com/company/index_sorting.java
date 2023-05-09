package com.company;
import java.util.Scanner;

public class index_sorting {

    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);

        System.out.println("\n\nPlease enter input by separating the values with a space.");

        String aa = x.nextLine();

        String [] array = aa.split(" ");

        int [] a = new int [array.length];

        int max = Integer.valueOf(array[0]);

        for(int i = 0; i < a.length; i++)
        {
            a[i] = Integer.valueOf(array[i]);

            if(a[i] > max)
                max = a[i];
        }

        int [] b = new int[max * 2 + 1];

        for(int i = 0; i < a.length; i++)
        {
            b[a[i] + max]++;
        }

        int acntl = 0;

        for(int i = 0; i < b.length;)
        {
            if(b[i] > 0)
            {
                a[acntl] = i - max;
                b[i]--;
                acntl++;
            }
            else
                i++;
        }

        b = null;

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
