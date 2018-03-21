class HelloPalak1
{
public static void main(String[]args)
{
String s="palakBadgujar123PalakHowareyouA";
int a=s.length();
int count =0;
char[] c=s.toCharArray();
int i=0;
for( i=0;i<a ;i++)
{
if(Character.isDigit(c[i]))
{
System.out.println("here the didit occuring"+i);
count++;
}
continue;
}
System.out.print(c[i]);
System.out.println("digits are"+count);
}
}
