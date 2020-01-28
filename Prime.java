import java.lang.*;
class Prime
{
public static void main(String a[])
{
int n1 = Integer.parseInt(a[0]);
int i;
int c=0;
if(n1==1)
{
System.out.println(a[0]+" is neither prime nor composite");
}
else
{
for(i=1;i<=n1;i++)
{
if(n1%i==0)
{
c++;
}
}
if(c==2)
{
System.out.println(a[0]+" is prime");
}
else 
{
System.out.println(a[0]+" is not prime");
}
}
}
}