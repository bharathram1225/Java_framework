package project1_delete;
import java.util.LinkedList;
import java.util.Scanner;
public class Student {
	
	int std_id;
	String name,branch;
	
	Student(int std_id, String name, String branch){
		this.std_id =std_id;
		this.name = name;
		this.branch=branch;
	}
	
	public String toString() {
		return this.name;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Object> s = new LinkedList<Object>();
		
		while(true) {
			System.out.println("1. Adding \n2. Size \n 3. removing \n 4. searching \n exit \n");
			System.out.println("Enter you choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("----------------------------");
				System.out.println("Adding Object to the List");
				System.out.println("Enter the Student id: ");
				int id = sc.nextInt();
				System.out.println("Enter the name: ");
				String name =sc.next();
				System.out.println("Enter the branch name: ");
				String branch = sc.next();
				Student s_1 = new Student(id,name,branch);
				s.add(s_1);
				System.out.println(s);
				System.out.println("----------------------------");
				break;
				
			case 2:
				System.out.println("----------------------------");
				System.out.println("The size of he Linked List is"+s.size());
				System.out.println("----------------------------");
				break;
				
				
			case 3:
				System.out.println("----------------------------");
				System.out.println("Before removing "+s);
				s.remove();
				System.out.println("After removing "+s);
				System.out.println("----------------------------");
				break;
			
			case 4:
				System.out.println("----------------------------");
				String search = sc.next();
				Student abc= new Student(0, search, null);
				s.add(abc);
				System.out.println("yes "+s.contains(abc));
				System.out.println(s);
				System.out.println("----------------------------");
				
				break;
				
			default:
				System.out.println("----------------------------");
				System.out.println("Invalid Option");
				System.out.println("----------------------------");
			}
		}

	}

}
