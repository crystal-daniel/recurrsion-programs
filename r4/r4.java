import java.util.*;
public class r4
{
    String rev=" ";
    String reverse(String st,int p)
    {
        if(p>=0)
        {
            rev=rev+st.charAt(p);
            reverse(st,p-1);
        }
        return rev;
    }
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        r4 obj=new r4();
        System.out.println("Enter a word");
        String s=input.next();
        String r=obj.reverse(s,s.length()-1);
        System.out.println(r);
    }
}
