import java.util.Scanner;
class Series
{
public static int fact(int index)
{
int f = 1, i;
for(i = 1; i <= index; i ++)
{
f = f*i;
}
return f;
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int i , num, x;
double frac, sum=0;
System.out.println("Enter the number of terms");
num = in.nextInt();
System.out.println("Enter the numerator");
x = in.nextInt();
for(i = 1; i <= num; i ++)
{
frac = Math.pow(x, i)/fact(i);
sum = sum + frac;
}
System.out.println("The sum is "+sum);
}
}