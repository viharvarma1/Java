import java.lang.*;
import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String a[])
{
int i,j,max,n=2,c=0;
int [][] m =new int [2][2];
int [][] b =new int [2][2];
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
System.out.println("reverced matrix: ");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        if(i==j)
        {
            b[i][j]=m[n-i-1][n-j-1];
        }
    }
}
for(i=0,j=n-1;i<n;i++,j--)
{
    b[j][i]=m[i][j];
}
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.print(b[i][j]+" ");
    }
    System.out.print("\n");
}
}
}