import java.lang.*;
import java.io.*;
import java.util.*;
public class Month
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
switch(n)
{
    case 1:
    System.out.println("January");
    break;
    
    case 2:
    System.out.println("Febuary");
    break;
    case 3:
    System.out.println("March");
    break;
    case 4:
    System.out.println("April");
    break;
    case 5:
    System.out.println("May");
    break;
    case 6:
    System.out.println("June");
    break;
    case 7:
    System.out.println("July");
    break;
    case 8:
    System.out.println("August");
    break;
    case 9:
    System.out.println("Sept");
    break;
    case 10:
    System.out.println("october");
    break;
    case 11:
    System.out.println("november");
    break;
    case 12:
    System.out.println("december");
    break;
    default:
    System.out.println("valid date");
    break;
}
}
}