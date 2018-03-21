class Tera19
{
public static void main(String[]args)
{
int[]a={1,2,3,4,5};
int[]a1={1,2,3,4};
public boolean check(int a[],int a1[])
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a1.length;j++)
{
if(a[i]==a[j])
{
System.out.println("Elements are equals");
}
}
}
}
}