import java.lang.*;
class Posneg
{
public static void main(String a[])
{
int n1 = Integer.parseInt(a[0]);
if(n1>0)
{
System.out.println(a[0]+" is positive");
}
else if(n1<0)
{
System.out.println(a[0]+" is negitive");
}
else if(n1==0)
{
System.out.println(a[0]+" is neither positive nor negitive");
}
else if(n1.isNaN())
{
System.out.println("An integer number as argument is expected ");
}
}
}