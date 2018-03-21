import java.util.*;
class Hii
{
public static void main(String[]args)
{
String[]s=Locale.getISOLanguages();
for(String s1:s)
{
System.out.println(s1);
}

String[]s2=Locale.getISOCountries();
for(String s3:s2)
{
System.out.println(s3);
}

Locale[] l=Locale.getAvailableLocale();
for(Locale l1:l)
{
System.out.println(l1.getDisplayLanguages()+"...."+l1.getDisplayCountries());
}

}
}
