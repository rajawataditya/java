import java.util.Scanner;
class Arrays
{  
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("enter no. of rows:");
int x=s.nextInt();
int a[]=new int[x];
int sum=0;
for(int k=0;k<x;k++)
{
	System.out.println("Enter elements: ");
a[k]=s.nextInt(); 
sum=sum+a[k];
}
System.out.println("2-D Array: ");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]); 
}  


System.out.println("Sum of all the elements: " +sum);
  int temp=0;
for(int m=1;m<a.length;m++)

{
if(a[m-1]>a[m])
{
	temp=a[m-1];
	a[m-1]=a[m];
	a[m]=temp;
}
else{
	temp=a[m];
}
}
System.out.println("largest no. in array:  " +temp);
}
}
 