package project1_delete;
import java.util.*;
public class Employee {
	
	String Employee_id;
	String Employee_name;
	Long Employee_phone;
	
	Employee(String Employee_id,String Employee_name,Long Employee_phone) {
		this.Employee_id = Employee_id;
		this.Employee_name = Employee_name;
		this.Employee_phone = Employee_phone;
	}
	
	 public String toString(){//overriding the toString() method  
		  return Employee_name+""+Employee_id;
		 } 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> array_object = new ArrayList<Employee>();
		while (true) {
		System.out.println("1. Enter employee data \n2.Display Employee data \n3. Remove \n4. Clear \n Exit");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: 
			System.out.println("Working for object 1: ");
			System.out.println("Enter the Employee id for object1: ");
			String Employee_id = sc.next();
			System.out.println("Enter the Employee Name for object1: ");
			String Employee_name = sc.next();
			System.out.println("Enter the Employee phone_no for object1: ");
			Long Employee_phone = sc.nextLong();
			array_object.add(new Employee(Employee_id,Employee_name,Employee_phone));
			break;
		
		case 2:
			for(Employee e:array_object)
			{
				System.out.println(e);
				System.out.println(e.Employee_id);
				System.out.println(e.Employee_phone);
			}
			break;
			
		case 3:

			System.out.println("The size of the ArrayList is:"+ array_object.size());
			if (array_object.size()==1) {
				System.out.println(array_object);
				array_object.removeAll(array_object);
			}
			else if (array_object.size()==0){
				System.out.println("The array list is Empty, Kindly Please insert so elements ");
			}
			else {
				System.out.println("Enter the position: ");
				int pos = sc.nextInt();
				
				System.out.println("The lement removed ,"+array_object.remove(pos-1));
				System.out.println(array_object);
			
			}
			break;
		
		case 4:
			array_object.clear();
			System.out.println("The array List after clearing "+array_object);
			break;
			
		case 5: 
		default:
			System.out.println("wrong choice");

			}
		}
	}

}
