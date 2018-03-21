import java.util.*;
class Locale11
{
public static void main(String[]args)
{
Locale l=new Locale("English");
System.out.println(l.getDefault());//en_US
System.out.println(l.getDisplayLanguage());//english
System.out.println(l.getDisplayCountry());//Unitate State

Locale L1=new Locale("pa","INDIA");
L1.setDefault(L1);
System.out.println(L1.getDefault());//pa_INDIA
System.out.println(L1.getDefault().getDisplayLanguage());//punjabi
System.out.println(L1.getDefault().getDisplayCountry());

String[] Country1=Locale.getIOSCountries();


}
}