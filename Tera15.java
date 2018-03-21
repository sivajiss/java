import java.util.*;
class Tera15
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter rows");
int row=obj.nextInt();
System.out.println("Enter colomns");
int cols=obj.nextInt();

System.out.println("rows"+row);
System.out.println("cols"+cols);

int[][]matrix=new int[row][cols];

for(int i=0;i<row.length;i++)
{
for(int j=0;j<cols.length;j++)
{
matrix[i][j]=obj.nextInt();
}
}
System.out.println("The values you entered");

for(int k=0;k<row.length;k++)
{
for(int l=0;l<cols.length;l++)
{
System.out.print(matrix[k][l]+"\t");
}
System.out.println();
}
}
}
