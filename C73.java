calss C73
{
public static void main(String[]args)
{
C1 obj1= new C2();
C2 obj2=new C2();
System.out.println(C1.a);
System.out.println(obj1.a);
System.out.println(C2.a);
System.out.println(obj2.a);
System.out.println((C1).a)
}
}
class C1
{
static int a=100;
}
class C2 extends C1
{
static int b=10;
}