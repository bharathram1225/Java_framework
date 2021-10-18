package project1_delete;
import java.util.*; 


public class generics_map {
	
	String roll;
	static String name;
	int age;
	
	generics_map(String name, String roll,int age)
	{
		this.name = name;
		this.age = age;
		this.roll = roll;				
	}
	
	public static void main(String[] args)
    {
		Map<String, generics_map> map = new HashMap<String, generics_map>();
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("1. add elements\n2. display\n3. search\n4. Empty check\n5. size\n6. remove elements\n7. List the values\n8. exit");
			System.out.println("Enter you choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Choice 1");
				System.out.println("------------------------------------------------");
				System.out.println("Enter the name: ");
				String name = sc.next();
				System.out.println("Enter the roll no: ");
				String roll = sc.next();
				System.out.println("Enter the age: ");
				int age = sc.nextInt();
				generics_map g1 = new generics_map("bharath","1RV20MC076",24);
				map.put(name, g1);
				System.out.println("------------------------------------------------");
				break;
				
			case 2:
				System.out.println("Choice 2");
				System.out.println("------------------------------------------------");
				System.out.println("Option 2 to display");
				Iterator<String> itr = map.keySet().iterator();
				while (itr.hasNext()) {
					String key = itr.next();
					generics_map avalue = map.get(key);
					System.out.println("Key is "+key);
					System.out.print(generics_map.name+" ");
					System.out.print(avalue.age+" ");
					System.out.println(avalue.roll+" ");
					System.out.println(key+" : "+avalue);	
				}
				break;
			case 3:
				System.out.println("Choice 3");
				System.out.println("------------------------------------------------");
				System.out.println("Enter the key to search the record :");
				String names = sc.next();
				Boolean flag = map.containsKey(names);
				if (flag==true){
					System.out.println("The concerned key exits!!!");
				}
				else {
					System.out.println("Sorry unable to search !!!");
				}
				System.out.println("------------------------------------------------");
				break;
			case 4:
				System.out.println("Choice 4");
				System.out.println("------------------------------------------------");
				Boolean flag2 = map.isEmpty();
				if (flag2==true){
					System.out.println("The Hash map is empty!!!");
				}
				else {
					System.out.println("The Hash map is not empty!!!");
				}
				System.out.println("------------------------------------------------");
				break;
				
			case 5:
				System.out.println("Choice 5");
				System.out.println("------------------------------------------------");
				System.out.print("The Size is: ");
				System.out.println(map.size());
				System.out.println("------------------------------------------------");
				break;
			case 6:
				System.out.println("Choice 6");
				System.out.println("------------------------------------------------");
				System.out.println("Enter the key to remove from the hash map");
				String key_name = sc.next();
				System.out.println(map.remove(key_name)+" removed successfully ");
				System.out.println("------------------------------------------------");
				break;
			
			case 7:
				System.out.println("Choice 6");
				System.out.println("------------------------------------------------");
				System.out.println("The values are: ");
				System.out.println(map.values());
				System.out.println("------------------------------------------------");
			
			default:
				System.out.println("wrong choice");
				break;
				
			}	
    	}
    }
}















