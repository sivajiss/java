class C78
{
public static void main(String[]args)
{
A obj=new C();
obj.m1();
obj.m2();
}
}
abstract class A
{
abstract void m1();
abstract void m2();
}
abstract class B extends A
{
void m1()
{
System.out.println("Hello");
}
 void m2()
{
System.out.println("i love you palak Badgujar");
}
}
class C extends B
{
}



