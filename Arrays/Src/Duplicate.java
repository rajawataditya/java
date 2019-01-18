import java.util.Scanner; 
public class Duplicate {
  public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements between 10 to 100:");
        for(int k = 0; k < n; k++)
        {
            a[k] = s.nextInt();
            if ((10>a[k])||(a[k]>100))
            {
                System.out.println("error enter element b/w 10 to 100");    
                k--;
            }    
        }
        System.out.println("2-D Array: ");
        for(int m=0;m<a.length;m++)
            {
                System.out.println(a[m]); 
            }  

 
        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if ((a[i] == a[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+a[j]);
                }
            }
        }
    }    
}