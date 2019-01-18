
import java.util.Scanner;
class EmployeeTest{

	public static void main(String args[]){

		String name;
		int yearjoin;
		String address;
		
		Scanner input = new Scanner(System.in);

		Employee employee1 = new Employee();
		Employee employee2 = new Employee("RAM", 2000, "Dwarka");
		employee2.displayEmployeeInformation();
		
System.out.println("Enter no. of employees:");
int x=input.nextInt();
	
for(int i=0;i<x;i++)
	
		{
			
		System.out.print("Enter Employee Name : ");
		name = input.next();
		employee1.setname(name);

		System.out.print("Enter Employee year of joining : ");
		yearjoin = input.nextInt();
		employee1.setyearjoin(yearjoin);

		System.out.print("Enter Employee Address : ");
		address = input.next();
		employee1.setaddress(address);
		employee1.displayEmployeeInformation();
		}
		

		
	}
}
