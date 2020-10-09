package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad08
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Wypisuj liczby aby zobaczyć ich dzielniki - pisząc 0 kończysz program");
        int liczba=0;
        while(true)
        {
            ArrayList<Integer> dzielniki = new ArrayList<Integer>();
            liczba= scan.nextInt();
            if(liczba==0)
            {
                break;
            }
            for(int i=1;i<=liczba; i++)
            {
                if(liczba%i==0)
                {
                    dzielniki.add(i);
                }
            }
            System.out.println("Dzielniki liczby "+ liczba + " to: " + dzielniki);
            dzielniki.clear();
        }
    }
}
