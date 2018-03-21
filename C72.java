class C72
{
public static void main(String[]args)
{
C1 obj =new C1();
int n=obj.Fact(5);
}
}
class C1
{ int F=0;
public int Fact(int n)
{
F=F*Fact(n-1);
return F;
}
}

