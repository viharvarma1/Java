import java.lang.*;
import java.io.*;
import java.util.*;
public class PrimeSum
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
int r;
int sum=0;
while(n>0)
{
    r=n%10;
    sum=sum+r;
    n=n/10;
}
System.out.println(sum);
}
}