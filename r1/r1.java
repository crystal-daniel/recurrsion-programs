import java.util.*;
public class r1
{
    int s=0;
    int sum(int n,int i)
    {
        if(i<=n)
        {
            s=s+i;
            sum(n,i+2);
        }
        return s;
    }
    public static void main()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        r1 obj=new r1();
        int s1=obj.sum(num,1);
        System.out.println(s1);
    }
}
