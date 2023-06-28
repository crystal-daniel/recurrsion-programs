//program to show recrsion3
public class recursion3
{
    void check(int r)
    {
        if(r>=0)
        {
            System.out.println(r);
            check(r-1);
        }
        else
        {
            System.out.println(r);
        }
    }
}
