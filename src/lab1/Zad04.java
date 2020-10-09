package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad04
{
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> wyrazy = new ArrayList<String>();
        ArrayList<Double> liczby = new ArrayList<Double>();
        ArrayList<Double> liczbyCałkowite = new ArrayList<Double>();
        while(true)
        {
            String wyraz = scan.nextLine();
            if(wyraz.equals("STOP"))
            {
                break;
            }else if(isInt(wyraz)==true)
            {
                double liczba;
                liczba = Double.parseDouble(wyraz);
                if(liczba<0)
                {
                    liczby.add(liczba);
                }else
                {
                    liczby.add(liczba);
                    liczbyCałkowite.add(liczba);
                }
            }else if(isDouble(wyraz)==true)
            {
                double liczba;
                liczba = Double.parseDouble(wyraz);
                liczby.add(liczba);
            }
            else
            {
                wyrazy.add(wyraz);
            }
        }
        System.out.println("Wyrazy = "+wyrazy);
        System.out.println("Liczby = "+liczby);
        System.out.println("Liczby Naturalne = "+liczbyCałkowite);
    }
}
