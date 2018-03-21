
import java.util.*;
class C66
{
public static void main(String[]args)
{
int sum=0;
int Sum1=0;
int count=0;
int count1=0;
int count2=0;
int count3=0;
System.out.println("Enter the no up to you want to found even and odd digit");
Scanner obj=new Scanner(System.in);
int no =obj.nextInt();
System.out.printf("Print the some of %d Natural number",no);
for(int i=1;i<=no;i++)
{
System.out.println(i);

if(i>10 && i<40)
{
if(i%2==0)
{
count++;
sum=sum+i;
}
else
{
count3++;
}
}
else
{
if(i>=3 && i<=30)
{
count1++;
Sum1=Sum1+i;
}
else
{
count2++;
}
}
}
System.out.println("Number of Even no up to 40:-"+count);
System.out.println("sum of Even no:-"+sum);
System.out.println("the no of Even no aprart from 10 and 40:-"+count3);

System.out.println("Number of Odd no:-"+count1);
System.out.println("Sum of Odd no up to 30:-"+Sum1);
System.out.println("count of odd no which are not multiple of 3:-"+count2);

}
}
