import java.io.*;
class Serializable1
{
public static void main(String[]args)
{
Hello o=new Hello(12);
FileOutputStream f=new FileOutputStream("Nena.txt");
ObjectOutputStream o1=new ObjectOutputStream(f);
ObjectOutputStream.writeObject(o1);

}
ObjectOutputStream.writeObject(o1);
}
class Hello implements Serializable
{
int a;
Hello(int a);
{
this.a=a;
}
}
