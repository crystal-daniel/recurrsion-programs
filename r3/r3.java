
public class r3
{
    int a=0,r=0;
    int rev(int n)
    {
        if(n!=0)
        {
            a=n%10;
            r=r*10+a;
            rev(n/10);
        }
        return r;
    }
}
