class CoCo101
{
public static void main(String[]args)
{
String s100="palak badgujar palak badguajr";
    String s   = s100.replace("palak", "jj");
System.out.println(s);
System.out.println(s100.contains("hjdj"));
 String s12="palak badgujar badgujar";
System.out.println(s12.matches("(.*)badgujar(.*)"));
String s13=s12.join("*",s12);
System.out.println(s13);

        
        
}
}