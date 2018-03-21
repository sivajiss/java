import java.io.*;
class Gono
{
public static void main(String[]args) throws IOException
{
FileReader obj=new FileReader("infoo.txt");
int i=obj.read();
while(i!=-1)
{
System.out.print((char)i);
i=obj.read();
}
}
}

