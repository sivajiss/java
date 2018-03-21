import java.util.*;
class Tera16
{
public static void main(String[]args)
{
System.out.println("Enter some values");
Scanner obj=new Scanner(System.in);
String value=obj.next();
System.out.println(value);
String value1=value.replaceAll("[0-9]","");
System.out.println(value1);
}
}

