import java.util.*;
import java.io.*;
class ProertyInfo 
{
public static void main(String[]args) throws Exception
{
Properties p=new Properties();
FileInputStream f=new FileInputStream("abc.properties");

p.load(f);
System.out.println(p);
}
}
