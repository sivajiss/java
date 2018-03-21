import java.util.*;
class KK
{
public static void main(String[]args)
{
Locale c=Locale.getDefault();
System.out.println(c.getDisplayCountry());
System.out.println(c.getDisplayLanguage());
Locale[]a=c.getAvailableLocales();
for(int i=0;i<a.length;i++)
{
Locale i1=a[i];
System.out.println(i1.getDisplayLanguage()+"..."+i1.getDisplayCountry());
}

}
}