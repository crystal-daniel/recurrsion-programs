//program to show recrsion4
public class recursion4
{
    void check(int r)
    {
        if(r>=0)
        {
            System.out.println(r);
            check(r-1);
            System.out.println(r);
        }
    }
}
