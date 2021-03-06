package project.leetcode.stream.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExamples {

	static List<Employee> employeeList = new ArrayList<Employee>();
	
	static {
		
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(122, "Jiya Brein", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
//		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
//		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
//		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
//		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
//		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
//		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
//		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
//		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
//		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
//		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
	}
	
	public static void main(String[] args) {
//		
//		Map<Integer,String> data = employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName,(old,newval)->newval));
//		System.out.println(data);
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.toList())));
//		employeeList.sort(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getId));
//		System.out.println(employeeList);
		
//		Long n = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).limit(2).distinct().collect(Collectors.toList());
		
//		System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).limit(2).map(Employee::getName).distinct().collect(Collectors.toList()));
		
//		employeeList.stream().dropWhile(obj-> obj.getAge()<30).skip(1).collect(Collectors.toList()).forEach(System.out::println);
		
//		System.out.println(employeeList.stream().filter(obj-> obj.getAge()> 25).findFirst().get());
//		
//		List<Integer> array = Arrays.asList(0, 1, 2, 3, 4);
//		
//		
//		List<String> array2 = Arrays.asList("sharad","Pawar","Hari","Jadu");
//		
//		String str = array2.stream().collect(Collectors.joining(", ", "Jr", "Mr. "));
//		System.out.println(str);
		
//		Integer [] arr= new Integer[] {4,2,5,7};
//		Integer [] ans= new Integer[arr.length];
//		
//		int t=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]%2==0) {
//				ans[t]=arr[i];
//				t+=2;
//			}
//		}
//		
//		t=1;
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] % 2 == 1) {
//				ans[t] = arr[i];
//				t += 2;
//			}
//		}
//		System.out.println(Arrays.toString(ans));
		
//		System.out.println(intSummaryStatistics.getCount());
//		List<Integer> array1 = Arrays.asList(5, 6);
//		
//		List<Integer> array2 = Arrays.asList(7, 8, 9);
////		  
//		List<List<Integer> >data = new ArrayList<>();
//		
//		data.add(array);
//		data.add(array1);
//		data.add(array2);
//		
//		
//		System.out.println(IntStream.of(1,2,3,4,5,6,3,6).max().getAsInt());
//
//		
//		System.out.println(data.stream().flatMap(obj ->obj.stream()).mapToInt(Integer::intValue).boxed().min(Comparator.comparing(Integer::intValue)));
//		
//		
//		System.out.println(data.parallelStream().flatMap(obj->obj.stream()).collect(Collectors.toList()));
//		System.out.println(sum);
		
		// Query 1 : How many male and female employees are there in the organization?
//				method1();
//				System.out.println("\n");
				// Query 2 : Print the name of all departments in the organization?
//				method2();
//				System.out.println("\n");
//				// Query 3 : What is the average age of male and female employees?
//				method3();
//				System.out.println("\n");
//				// Query 4 : Get the details of highest paid employee in the organization?
//				method4();
//				System.out.println("\n");
//				// Query 5 : Get the names of all employees who have joined after 2015?
//				method5();
//				System.out.println("\n");
//				// Query 6 : Count the number of employees in each department?
//				method6();
//				System.out.println("\n");
//				// Query 7 : What is the average salary of each department?
//				method7();
//				System.out.println("\n");
//				// Query 8 : Get the details of youngest male employee in the product
//				// development department?
//				method8();
//				System.out.println("\n");
//				// Query 9 : Who has the most working experience in the organization?
//				method9();
//				System.out.println("\n");
//				// Query 10 : How many male and female employees are there in the sales and
//				// marketing team?
//				method10();
//				System.out.println("\n");
//				// Query 11 : What is the average salary of male and female employees?
//				method11();
//				System.out.println("\n");
//				// Query 12 : List down the names of all employees in each department?
//				method12();
//				System.out.println("\n");
//				// Query 13 : What is the average salary and total salary of the whole
//				// organization?
//				method13();
//				System.out.println("\n");
//				// Query 14 : Separate the employees who are younger or equal to 25 years from
//				// those employees who are older than 25 years.
//				method14();
//				System.out.println("\n");
//				// Query 15 : Who is the oldest employee in the organization? What is his age
//				// and which department he belongs to?
//				method15();

	}
	
	public static void method1() {
		
		Map<String,Long> data=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		Map<String,List<Employee>> data1= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));
		
		Map<Boolean, List<Employee>> data2= employeeList.stream().collect(Collectors.partitioningBy(emp->emp.getGender().equals("Male")));
		
		Map<Boolean, Long> data3= employeeList.stream().collect(Collectors.partitioningBy(emp->emp.getGender().equals("Male"),Collectors.counting()));
		
		System.out.println(data3);
	}

}
