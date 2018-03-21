class Tera14
{
public static void main(String[]args)
{
String s="palak badgujar hello gudiya";
char[]c=s.toCharArray();
int i=0;
for( i=0;i<c.length;i++)
{
if((c[i]!=' ')&&(c[i]!='\t'))
{
System.out.print(c[i]);
}
}
}
}
