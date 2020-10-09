package lab1;

import java.util.Random;

public class Zad02
{
    static Random generator = new Random();
    static void losujTablice(int[] tablica)
    {
        for(int i=0; i<12;i++)
        {
            tablica[i]= generator.nextInt(101);
        }
    }

    static void wyświetlTablice(int[] tablica)
    {
        for(int i=0; i<12;i++)
        {
            System.out.print(tablica[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] tablica = new int[12];
        losujTablice(tablica);
        wyświetlTablice(tablica);
    }
}
