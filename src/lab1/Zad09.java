package lab1;

import java.util.Random;

public class Zad09
{
    static int nwd(int a, int b)
    {
        int c;
        while (b != 0)
        {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    static int nwd3(int a, int b, int c)
    {
        int x,y;
        x=nwd(a,b);
        y=nwd(x,c);
        return y;
    }

    static Random generator = new Random();

    public static void main(String[] args)
    {
        int a,b,c,nwd;
        for(int i=0; i<10; i++)
        {
            a=generator.nextInt(100)+1;
            b=generator.nextInt(100)+1;
            c=generator.nextInt(100)+1;

            System.out.println("NWD dla liczb: "+a+", "+b+", "+c+" to: "+nwd3(a,b,c));
        }
    }
}
