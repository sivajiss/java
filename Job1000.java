import java.util.*;
class Job1000
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter size");
int n=obj.nextInt();
int[]a=new int[n];
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+obj.nextInt();
}
System.out.println("the sum:-"+sum);
}
}

