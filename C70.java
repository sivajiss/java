class C70
{
public static void main(String[]args)
{
P obj=new P();
obj.m1();
obj.m2();
}
}
interface P1
{
public void m1();
default void m2()
{
System.out.println("hello1");
}
}

interface P2
{
default void m2()
{
System.out.println("hello2");
}
}

class P implements P1,P2
{
public void m1()
{
System.out.println("hello palak");
}

public void m2()
{
System.out.println("hello 3");
}
}