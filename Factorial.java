import java.lang.*;
import java.io.*;
import java.util.*;
public class Factorial
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
int i,fact=1;
for(i=1;i<=n;i++)
{
    fact=fact*i;
}
System.out.println(fact);
}
}
