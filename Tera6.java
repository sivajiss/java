class W
{
W()
{
System.out.println("palak1");
}
W(String s1)
{
System.out.println("palak with String");
}
W(String s1,String s2)
{
System.out.println("palak with String value");
}
}
 class W1 extends W
{
W1()
{
Super();
System.out.println("child1");
}
W1(string s1)
{
super("palak");
System.out.println("child2");
}

W1(String s1,String s2)
{
super("palak","palak");
System.out.println("Child3");
}
}
class Tera6 
{
public static void main(String[]args)
{
W obj=new W();
W obj1=new W("palak");
W obj2=new W("palak","palak");

W1 obj1=new W1();
W1 obj2=new W1("palak");
W1 obj3=new W1("palak","palak");
}
}

