
import java.util.*;
class C65
{
public static void main(String[]args)
{
int sum=0;
int Sum1=0;
int count=0;
int count1=0;
System.out.println("Enter the no up to you want to found even and odd digit");
Scanner obj=new Scanner(System.in);
int no =obj.nextInt();

System.out.printf("Print the some of %d Natural number",no);
for(int i=1;i<=no;i++)
{
System.out.println(i);
if(i%2==0)
{
count++;
sum=sum+i;
}
else
{
count1++;
Sum1=Sum1+i;
}
}
System.out.println("Number of Even no:-"+count);
System.out.println("sum of Even no:-"+sum);

System.out.println("Number of Odd no:-"+count1);
System.out.println("Sum of Odd no:-"+Sum1);

}
}
