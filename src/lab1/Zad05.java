package lab1;

import java.util.ArrayList;
import java.util.Random;

public class Zad05
{
    static Random generator = new Random();
    public static void main(String[] args)
    {
        ArrayList<Integer>z1 = new ArrayList<Integer>();
        ArrayList<Integer>z2 = new ArrayList<Integer>();
        ArrayList<Integer>z3 = new ArrayList<Integer>();
        ArrayList<Integer>z4 = new ArrayList<Integer>();

        int rozmiarTablicy = 10;
        int[] tab = new int[rozmiarTablicy];

        int liczba=0;

        for(int i=0;i<rozmiarTablicy;i++)
        {
            liczba=generator.nextInt(201)-100;
            if((liczba>=-10)&&(liczba<=10))
            {
                z1.add(liczba);
            }else if((liczba>=(-100))&&(liczba<=0))
            {
                z2.add(liczba);
            }else if((liczba>=0)&&(liczba<=100))
            {
                z3.add(liczba);
            }else if((liczba>=80)&&(liczba<=100))
            {
                z4.add(liczba);
            }
        }
        System.out.println("-10 - 10: "+z1);
        System.out.println("-100 - 0: "+z2);
        System.out.println("0 - 100: "+z3);
        System.out.println("80 - 100: "+z4);
    }
}
