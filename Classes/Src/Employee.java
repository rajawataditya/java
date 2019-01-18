import java.util.Scanner;
class Employee	
	{
		String name;
		int yearjoin;
		String address;
		Scanner input = new Scanner(System.in);
		
		Employee()	
		{
			name = "";
			yearjoin = 2000;
			address = "";
		}

	
		Employee(String name,int yearjoin, String address)	
		{
			this.name = name;
			this.yearjoin = yearjoin;
			this.address = address;
		}

	
		String getname()	{
		return name;
	}


	int getyearjoin() {
		return yearjoin;
	}


	String getaddress(){
		return address;
	}	
	
	
	void setname(String name){
		this.name = name;
	}

	void setyearjoin(int yearjoin){
		this.yearjoin = yearjoin;
	}

	void setaddress(String address){
		this.address = address;
	}
	

	
	
	void displayEmployeeInformation(){
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Year of joining : " + yearjoin);
		System.out.println("Employee Address : " + address);
	}
}
