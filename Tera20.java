class Tera20
{
public void findSum(int[] a,int n)
{
for(int i=0;i<a.length;i++)
{
for(int j=i+1;ij<a.length;j++)
{
if(a[i]+a[i+1]==n)
{
System.out.println(a[i]"+"a[i+1]=n);
}
}
}
public static void main(String[]args)
{
findSum(new int[]{1,2,47,3,6},3);
findSum(new int[]{3,1,2,57},3);
}

