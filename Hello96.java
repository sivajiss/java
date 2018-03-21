import java.util.*;
class Hello96
{
public static void main(String[]args)
{
Formatter obj=new Formatter();
int a=10;
int b=20;
int c=a+b;
String s=obj.format("the value%d and%d sum is:-"+a,b,c);
System.out.println(s);
}
}