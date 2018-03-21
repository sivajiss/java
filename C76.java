class C76
{
public static void main(String[]args)
{
C obj1=new C();
obj1.walk();
obj1.eat();
System.out.println("*****");
obj1=new B();
obj1=null;
obj1.eat();
obj1.walk();
C.walk();
C.eat();
B.walk();
B.eat();

obj1.walk();
obj1.eat();
System.out.println("*****");
B obj=new B();
obj.walk();
obj.eat();

}
}
class C
{
static void walk()
{
System.out.println("i am walking");
}
static void eat()
{
System.out.println("i am eating");
}
}
class B extends C
{
static void walk()
{
System.out.println("walking");
}
static void eat()
{
System.out.println("eating");
}
}

