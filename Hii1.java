import java.util.*;
import java.text.*;
class Hii1
{
public static void main(String[]args)
{
double  
//NumberFormat nf=NumberFormat.getInstance(Locale.US);1,234.566
NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
String s=nf.format(d);
System.out.println(s);
}
}