//program to show recrsion2
public class recursion2
{
    void check(int r)
    {
        if(r>=0)
        {
            System.out.println(r);
            check(r-1);
        }
        System.out.println(r);
    }
}
