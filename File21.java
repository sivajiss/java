import java.io.*;
class File21
{
public static void main(String[]args) throws IOException
{
File f=new File("infoo.txt");
FileReader r=new FileReader(f);

char[]c=new char[(int)f.length()];
int i1=r.read(c);
for(int s:i1)
{
System.out.println((int)s);
} 
}
}