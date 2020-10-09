package lab1;

import java.util.Random;
import java.util.Scanner;

public class Zad10
{
    static Scanner scan = new Scanner(System.in);
    static Random generator = new Random();
    public static void main(String[] args)
    {
        System.out.println("Wypisz rozmiary tablic: ");
        System.out.println("x: ");
        int x=scan.nextInt();
        System.out.println("y: ");
        int y= scan.nextInt();
        int[][] tablica = new int[x][y];

        for(int i=0; i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
                tablica[i][j]=j;
            }
        }

        for(int i=0; i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(tablica[i][j]+" ");
            }
            System.out.println();
        }

        int z1=generator.nextInt(x);
        int z2=generator.nextInt(y);

        int z3=generator.nextInt(x);
        int z4=generator.nextInt(y);

        System.out.println("Wylosowane punkty to: ");
        System.out.println("p1: ("+z1+", "+z2+")" );
        System.out.println("p2: ("+z3+", "+z4+")" );

        if(z1==z3)
        {
            System.out.println("Punkty znajdują się w tej samej kolumnie");
        }else if(z2==z4)
        {
            System.out.println("Punkty znajdują się w tem samym wierszu");
        }else
        {
            System.out.println("Punkty nie mają wspólnego wiersza i kolumny");
        }

    }
}
