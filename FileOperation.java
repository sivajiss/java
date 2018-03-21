import java.io.*;
class FileOperation
{
public static void main(String[]aregs)throws Exception
{
PrintWriter p1=new PrintWriter("palakInfo.txt");
p1.println("hello");
p1.println("palak");
p1.println("how");
p1.println("are");
p1.println("you");
p1.flush();

PrintWriter p2=new PrintWriter("palakInfo1.txt");
p2.println("Hope");
p2.println("you");
p2.println("are");
p2.println("Doing");
p2.println("well");
p2.flush();

PrintWriter p3=new PrintWriter("MyFile2.txt");
BufferedReader bw=new BufferedReader(new FileReader("palakInfo.txt"));
String s=bw.readLine();
while(s!=null)
{
p3.println(s);
s=bw.readLine();
}

BufferedReader bw1=new BufferedReader(new FileReader("palakInfo1.txt"));
String s1=bw1.readLine();
while(s1!=null)
{
p3.println(s1);
s1=bw.readLine();
}

p3.flush();
p1.close();
p2.close();
p3.close();
bw.close();
bw1.close();






}
}