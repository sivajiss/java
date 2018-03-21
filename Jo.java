class Jo
{
public static void main(String[]args)
{ int count=0;
int[]a={5,4,1,5,6,2,1,2};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
count++;
continue;
//System.out.println(a[i]);
}
System.out.print(a[i]);
}
//System.out.print(a[i]);
}
System.out.println("reapeatinf element"+"\t"+count);
}
}


