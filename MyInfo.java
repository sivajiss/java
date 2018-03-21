import java.util.*;
import java.io.*;
class MyInfo
{
public static void main(String[]args) throws Exception
{
Properties p=new Properties();
FileInputStream m=new FileInputStream("abc.properties.txt");
p.load(m);
System.out.println(p);
p.setProerty("Address","Hoshangabad");
FileOutputStream f=FileOutputStream("abc.properties");
p.store(f,"update");
}
}
