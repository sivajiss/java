 class Tera13
{
public static void main(String[]args)
{
String s="palak12badgujar";
char[]c=s.toCharArray();
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

