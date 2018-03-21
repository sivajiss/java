class JJ
{
public static void main(String[]args)
{
int[]arr={2,5,5,6,7,88};
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
Hello obj=new Hello();
obj.m1(arr);
}
}
class Hello
{
public void m1(int[]arr1)
{
System.out.println("hello");
for(int j=0;j<arr1.length;j++)
{
System.out.println(arr1[j]);
}
}
}
