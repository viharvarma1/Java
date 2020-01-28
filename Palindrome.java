import java.lang.*;
import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String a[])
{
int  l=a[0].length();
int i;
String s=a[0];
String s1="";
for(i=l-1;i>=0;i--)
{
    s1=s1+s.charAt(i);
}
if(s.equals(s1))
{
    System.out.println("Palindrome");
}
else
{
     System.out.println("Not Palindrome");
}
}
}