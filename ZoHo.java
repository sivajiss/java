class Address
{
String city;
int plot;
Address(String city,int plot)
{
this.city=city;
this.plot=plot;
}
}
class Info implements Cloneable
{
Address add;
String name;
Info(String name,Address add)
{
this.name=name;
this.add=add;
}
public Object clone() throws CloneNotSupportedException
{
if(this instanceOf Cloneable)
{
Address add=new Address(this.Address.city,this.Address.plot);
Info obj=new Info(this.name,add);
return obj;
}
else
throw new CloneNotSupportedException(getClass().getName());
}
}

