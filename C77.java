class C77
{
public static void main(String[]args)
{
C obj=new C();
obj.m1();
obj.m2();
}
}
abstract class A
{
abstract void  m1();
abstract void m2();
}
abstract class B extends A
{
public void m1()
{
System.out.println("i love you");
}
}
abstract class C extends B
{
public void m2()
{
System.out.println(" love you too");
}
}