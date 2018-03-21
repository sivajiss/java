
import java.io.*;
import java.util.*;
class Tare
{
public static void main(String[]args)
{
String s="palak123badgujar";

char[]c=s.toCharArray();
String[]s1=s.split("123",2);
System.out.println(Arrays.toString(s1));
String s5=null;
for(int j=0;j<s1.length;j++)
{
System.out.println(s1[j]);
s5=Array.toString(s1);
for(int t=0;t<s5.length();t++)
{
if(s5[i]=="b")
{
String s3=Array.toUpperCase(s5);
System.out.println(s3);
}
}

}
for(int i=0;i<c.length;i++)
{
if(Character.isDigit(c[i]))
{
continue;
}
System.out.print(c[i]);
}
}
}
