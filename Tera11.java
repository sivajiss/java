class Tera11
{
public static void main(String[]args)
{
String s="palak badgujar";
char[]c=s.toCharArray();

for(int i=0;i<c.length;i++)
{
if((c[i]==' ') || (c[i]='\t'))
{
continue;
}
System.out.println(c[i]);
}
}
}
