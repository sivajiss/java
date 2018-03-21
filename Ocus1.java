
class Ocus
{
public int a=5;
Ocus()
{
System.out.println("hello constructor");
}
public void m1()
{
System.out.println("hello friends");
}
}
class Ocus2 extends Ocus
{
public Ocus2()
{
super();
System.out.println("hello i m sub class construcctor");
}
public void m1()
{ 
a=++a;
System.out.println("meri class sub class");
System.out.println("value"+a);
}
}
 public class Ocus1
{
public static void main(String[]args)
{
Ocus o=new Ocus();
Ocus2 o2=new Ocus2();
o2.m1();
}
}
