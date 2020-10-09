package lab1;

import java.util.Random;

public class Zad03
{
    static Random generator = new Random();
    public static void main(String[] args)
    {
        double x=0;

        int liczbaWykonań = generator.nextInt(101);
        System.out.println("n= "+liczbaWykonań);
        for(int i=0; i< liczbaWykonań; i++)
        {
            x=(generator.nextDouble()*4)-2;
            if(x>=0)
            {
                System.out.println("x= "+ x + " y="+ (Math.sin((3*x))-1.8));
            }else
            {
                System.out.println("x= "+ x + " y="+ (-2*x));
            }
        }
    }
}
