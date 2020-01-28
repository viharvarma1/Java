import java.lang.*;
import java.io.*;
import java.util.*;
public class MinMatrix
{
public static void main(String a[])
{
int i,j,max,n=3,c=0;
int [][] m =new int [3][3];
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        m[i][j]=Integer.parseInt(a[c++]);
    }
}

System.out.println("matrix:");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.print(m[i][j]+" ");
    }
    System.out.print("\n");
}
System.out.print("max value: ");
max=m[0][0];
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        if(max<m[i][j])
        {
            max=m[i][j];
        }
    }
}
System.out.print(max);
}
}