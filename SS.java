
import java.util.*;
public class SS {
    public static void main(String[]args)
    {
        String s="palak*badgujarsweet*heart";
        StringTokenizer o=new StringTokenizer(s,"*");
       System.out.println(o.countTokens());
        while(o.hasMoreTokens())
        {
            String a=o.nextToken();
            System.out.println(a);
            
        }
        
    }
    
}
