import java.text.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		
		System.out.println("Enter the number of employees");
		int no = sc.nextInt();
		String info[] = new String[no];
		List<Employee> list = new ArrayList<>();
		System.out.println("Enter the employee details");
		
		for(int i=0; i<no; i++){
		    info[i] = sc.next();
		    String x[] = info[i].split(":");
		    Employee obj = new Employee(x[0], x[1], Double.parseDouble(x[2]));
		    list.add(obj);
		}
		
		System.out.println("Enter the number of times salary limit to be searched");
		int limit = sc.nextInt();
		String count[] = new String[limit];
		for(int i=0; i<limit; i++){
		    System.out.println("Enter the salary limit to be searched");
		    double salaryLimit = sc.nextDouble();
		    Management b = new Management(salaryLimit, list);
		    b.run();
		    int theCount = b.getCount();
		    DecimalFormat df = new DecimalFormat("#.0");
		    String d = df.format(salaryLimit);
		    count[i] = d+":"+String.valueOf(theCount);
		}
		for(int i=0;i<count.length;i++){
		    System.out.println(count[i]);
		}
	}	
}
