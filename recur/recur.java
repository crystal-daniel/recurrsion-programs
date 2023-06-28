
public class recur
{
    int a=1;
    int power(int n,int p)
    {
        if(p==0)
        {
            return (1);
        }
        else
        {
            a=a*n;
            power(n,p-1);
        }
        return a;
    }
}
