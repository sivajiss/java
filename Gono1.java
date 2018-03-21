class Gono1
{
public static void main(String[]args)
{
int no=125;
int rev=0;
int rem=0;
while(no!=0)
{
rem=rem%10;
rev=rev+rem;
no=no/10;
}
System.out.println(rev);
}
}

