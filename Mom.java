import java.util.*;
class Mom
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in)
System.out.println("enter the size of array");
int n=obj.nextInt();
int[]a=new int[n];
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+obj.nextInt();
}
System.out.println("the sum of array is:-"+sum);
}
}

