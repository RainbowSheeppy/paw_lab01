package lab1;

import java.util.ArrayList;
import java.util.Random;

public class Zad06
{
    static Random generator = new Random();
    public static void main(String[] args)
    {
        int zakresDolny=0;
        int zakresGórny=0;
        ArrayList<Integer>liczby = new ArrayList<Integer>();
        for(int i=0;i<20;i++)
        {
            liczby.add(generator.nextInt(201)-100);
        }
        for(int i=0;i<5;i++)
        {
            ArrayList<Integer>zakres = new ArrayList<Integer>();
            zakresDolny=-((generator.nextInt(6))*20);
            zakresGórny=((generator.nextInt(6))*20);
            for(int j=0;j<20;j++)
            {
                if((liczby.get(j)>zakresDolny)&&(liczby.get(j)<zakresGórny))
                {
                    zakres.add(liczby.get(j));
                }
            }
            System.out.println("Liczby od "+zakresDolny+" do "+zakresGórny+" "+ zakres);
            zakres.clear();
        }
        System.out.println(liczby);
    }
}
