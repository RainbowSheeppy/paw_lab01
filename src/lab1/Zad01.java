package lab1;

public class Zad01
{
    public static void main(String[] args)
    {
        double wynik=0;
        for(int i=-15;i<=15;i++)
        {
            if(i<=-10)
            {
                wynik=(Math.pow(i,2))-2;
                System.out.println(wynik);
            }else if((i>-10)&&(i<=0))
            {
                wynik=((Math.log(-i))+i)/(Math.sqrt((i+20)));
                System.out.println(wynik);
            }else if(i>0)
            {
                wynik=Math.sin((Math.PI / 6)*i);
                System.out.println(wynik);
            }
        }
    }
}
