import java.time.Clock;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /* String s2 = "VK is god vk is god";
        String s3 = "MSD is legend";

        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.charAt(6));
        System.out.println(s2.endsWith("legend"));
        System.out.println(s2.concat(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.replace("VK", "ABD"));
       // System.out.println(s2.replaceAll("VK" , "Rohit"));
        System.out.println(s3.replace("Rohit", "VK"));
        System.out.println(s2.substring(6));
        System.out.println(s3.trim());

        String s4= "Hello";
        String s5 = "hel"+"lo";

        if(s4.equalsIgnoreCase(s5))
        {
            System.out.println("Condition Correct");
        }
        else
        {
            System.out.println("Condition wrong");
        }

        int x = 50;

        while(x<=100)
        {
            System.out.println(x);
            x=x+10;
        }
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        int a=15;
        int b = 30;
        int c = 10;
        */


        String str = "java";
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i ;j < str.length(); j++)
            {
                if((i*j)%2 ==0)
                {
                    System.out.println(str.charAt(i));
                }

                else
                {
                    System.out.println(str.charAt(j));
                }
            }
        }
        int v = 4;

        System.out.println(++v);
        //System.out.println(v);
    }
}



