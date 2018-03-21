import java.util.*;
class C69
{
public static void main(String[]args)
{
int[][]arr=new int[3][];
arr[0]=new int[3];
arr[1]= new int[4];
arr[2]= new int[3];
System.out.println("Enter the value that will stored inside the array");

Scanner obj=new Scanner(System.in);

for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j]=obj.nextInt();
}
System.out.println();
}

System.out.println("the value that ypu have entered");
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();
}

}
}



