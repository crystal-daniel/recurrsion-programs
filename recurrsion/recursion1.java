//program to show recrsion1
public class recursion1
{
    void check(int r)
    {
        if(r>=0)
        {
            System.out.println(r);
            check(r-1);
        }
    }
}
