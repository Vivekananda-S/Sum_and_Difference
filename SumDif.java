import java.util.*;
class AnsFinder
{
    void ans(int a, int b)
    {
        if(a>b)
        System.out.println(a-b);
        else
        System.out.println(a+b);
    }
}
public class SumDif
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        AnsFinder object_x = new AnsFinder();
        object_x.ans(a,b);
    }
}