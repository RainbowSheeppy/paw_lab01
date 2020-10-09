package lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad07
{
    static Random generator = new Random();
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int liczba = generator.nextInt(101);
        int x=101;
        ArrayList<Integer>błędy = new ArrayList<Integer>();

        System.out.println("Wypisuj liczby od 0 do 100 aż zgadniesz GL&HF: ");
        while(true)
        {
            x= scan.nextInt();
            if(x<liczba)
            {
                System.out.println("Liczba której szukasz jest większa");
                błędy.add(x-liczba);
            }else if(x>liczba)
            {
                System.out.println("Liczba której szukasz jest mniejsza");
                błędy.add(x-liczba);
            }
            if(x==liczba)
            {
                System.out.println("Gratulacje WYGRAŁEŚ !!!");
                break;
            }
        }
        System.out.println("Błędy: " + błędy);
    }
}
