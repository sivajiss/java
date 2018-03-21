import java.util.*;
class Resource1
{
public static void main(String[]args)
{
ResourceBundle r= ResourceBundle.getBundle("abc.properties");
System.out.println(r.getString("Name"));
}
}