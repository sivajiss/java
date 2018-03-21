import java.util.*;
class C68
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter total no you wanna store in array");
int no=obj.nextInt();
int[]arr=new int[no];
System.out.println("no Store the Elements inside the array:-");
for(int i=0;i<arr.length;i++)
{
arr[i]=obj.nextInt();
}

System.out.println("the elemnts that you havaa entered are as follows:-");
int n=arr.length;

for(int i=n-1;i>=0;i--)
{
System.out.println(arr[i]);
}
}
}