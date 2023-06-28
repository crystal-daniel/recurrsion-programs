
public class recur2
{
    int f=1;
    int fact(int n)
    {
        if(n!=0)
        {
            f=n*fact(n-1);
        }
        return f;
    }
}
