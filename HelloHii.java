import java.util.Scanner;
class HelloHii
{
public static void main(String[]args)
{
String s="palak badgujar";
Scanner obj=new Scanner(s);
obj.useDelimiter("\\.");
while(obj.hasNext())
{
String s2=obj.next();
System.out.println(s2);
}
}
}
