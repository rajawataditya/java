import java.util.Scanner;
class Testarray
{  
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("enter no. of rows:");
int x=s.nextInt();
int a[]=new int[x];
for(int k=0;k<x;k++)
{
a[k]=s.nextInt(); 
}
System.out.println("2-D Array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]); 
}
System.out.println("After Multiplications");  
for(int j=0;j<a.length;j++)
{
if (a[j]%2==0)
{
System.out.println(a[j]=a[j]*2);
}
}
} 
}  