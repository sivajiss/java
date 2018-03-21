interface T1{
void m2();
}
interface T2{
void m2();
}
class G implements T1,T2
{
public void m2 ()
{
System.out.println("hilo");
}
public void m2 ()
{
System.out.println("hilo");
}
}
class HH12
{
public static void main(String[]args)
{
G obj=new G();
obj.m1();
obj.m2();
}
}