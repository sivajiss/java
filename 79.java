Class C79
{
public static void main(String[]args)
{
B obj=new B();
obj.m1();
}
}
abstract class A
{
 int a;

A(int a)
{
this.a=a;
System.out.println(a);
}

{System.out.println("hello palak badgujar ");}

void m1()
{
System.out.println("i love you when you see me ,i love you when you feel me");
}
}
class B extends A
{
B()
{
super(10);
System.out.println("hello");
}
}
