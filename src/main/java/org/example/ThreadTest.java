package org.example;

public class ThreadTest extends Thread
{
    public static void main(String [] args)
    {
        double values[] = {-2.3, -1.0, 0.25, 4};
        int cnt = 0;
        for (int x=0; x < values.length; x++)
        {
            if (Math.round(values[x] + .5) == Math.ceil(values[x]))
            {
                ++cnt;
            }
        }
        System.out.println("same results " + cnt + " time(s)");
        String s = "ABC";
        s.toLowerCase();
        s += "def";
        System.out.println(s);
    }
}