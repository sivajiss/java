class D6
{
public static void main(String[]args)
{
char[]L={};
char[]c={'p','a','l','a','k','b','a','d','g','u','j','a','r','p','a','l','a','k'};
int len=c.length;
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
while(c[i]==c[j])
{
if(!(c.length==len))
{
L[i]=c[i];
}
}
}
}
System.out.println("PREPEATING VHRACTER ARE:-");
for(int k=0;k<L.length;k++)
{
System.out.print(L[k]);
}
}
}
