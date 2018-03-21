
import java.util.*;
class JoKo
{
public static void main(String[]args)
{
List l=new ArrayList();
l.add(10);
l.add(20);
List l1=new ArrayList();
l1.add(30);
l1.add(200);
l1.add(290);
Collections.copy(l1,l);
System.out.println(l1);
Enumeration e=Collections.enumeration(l);
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
List s=Collections.list(e);
System.out.println(s);
}
}







