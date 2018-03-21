import java.util.*;
class JJ1
{
public static void main(String[]args)
{
int r,sum=0;
int temp;
Scanner obj=new Scanner(System.in);
int no=obj.nextInt();
temp=no;
while(no>0)
{
r=no%10;
sum=sum*10+r
;
no=no/10;
}
if(temp==sum)
{
System.out.println("no is ryt");
}
else
{
System.out.println("no is not ryt");
}
}
}



