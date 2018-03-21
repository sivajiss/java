class Ooo
{
public static void main(String[]args)
{
A obj1 =new A();
B obj2 =new B();
C obj3 =new C();
D obj4 =new D();

System.out.println("*****");

obj1=new B();
obj1=new C();
obj1=new D();
System.out.println("*****");

System.out.println(obj4 instanceOf A);
}
}
System.out.println("*****");
class A
{
{System.out.println("hello1");}
}
class B extends A
{
{System.out.println("hello2");}
}

class C extends B
{
{System.out.println("hello3");}
}

class D extends C
{
{System.out.println("hello4");}
}

