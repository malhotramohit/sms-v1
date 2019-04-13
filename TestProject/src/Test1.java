import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Mohit", 423443);
		Employee emp2 = new Employee(2, "Rahul", 4335656);
		Employee emp3 = new Employee(3, "Shyam", 45443);
		Employee emp4 = new Employee(4, "Mohit", 878788);
		Employee emp5 = new Employee(5, "Swaraj", 767755);
		Employee emp6 = new Employee(3, "Shyam", 45443);
		Employee emp7 = new Employee(7, "Anish", 35546);

		List<Employee> empList = new ArrayList<>(10);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);

		displayEmployeesBySimpleForLoop(empList);

		displayEmployeesByForEach(empList);

		displayEmployeesByIterator(empList);

		System.out.println(empList);

		Collections.sort(empList, new SalaryComparator());

		System.out.println(empList);
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getSalary() > o2.getSalary()) {
					return -1;
				} else if (o1.getSalary() < o2.getSalary()) {
					return 1;
				} else {
					return 0;
				}
			}

		});

		System.out.println(empList);
		
		Collections.sort(empList, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));

		// List<Employee> sortedEmpList = sortEmpByNameAndSalary(empList);

		// System.out.println(sortedEmpList);

		List<Employee> sortedEmpList1 = sortEmpByName(empList);

		List<Employee> sortedEmpList2 = sortEmpBySalary(empList);

		int empId = 6;
		Employee empRemoved = removeById(empList, empId);

		HashMap<String, Employee> empMap = convertListToMap(empList);

		displayEmpMap(empMap);

		String nameOfTheEmp = "Mohit";

		removeByNameFromMap(empMap, nameOfTheEmp);

		List<Employee> empListWithoutDuplicate = removeDuplicateEntriesFromList(empList);

	}

	/**
	 * Use simple for loop
	 * 
	 * for(int i =0 ; i<size; i++){
	 * 
	 * }
	 * 
	 * @param empList
	 */
	private static void displayEmployeesBySimpleForLoop(List<Employee> empList) {

	}

	/**
	 * Use For each loop for(Double obj : list){
	 * 
	 * }
	 * 
	 * @param empList
	 */
	private static void displayEmployeesByForEach(List<Employee> empList) {

	}

	/**
	 * Use iterator Iterator iterator = list.iterator();
	 * 
	 * @param empList
	 */
	private static void displayEmployeesByIterator(List<Employee> empList) {

	}

	/**
	 * This method will return a sorted list of employees based name and is name are
	 * then by salary
	 * 
	 * @param empList
	 * @return
	 */
	private static List<Employee> sortEmpByNameAndSalary(List<Employee> empList) {

		Collections.sort(empList);
		return empList;
	}

	/**
	 * Use comparator
	 * 
	 * @param empList
	 * @return
	 */
	private static List<Employee> sortEmpBySalary(List<Employee> empList) {

		return null;
	}

	/**
	 * Use comparator
	 * 
	 * @param empList
	 * @return
	 */
	private static List<Employee> sortEmpByName(List<Employee> empList) {
		return null;
	}

	/**
	 * This will remove and return the removed element based on id
	 * 
	 * @param empList
	 * 
	 * @param empId
	 * @return
	 */
	private static Employee removeById(List<Employee> empList, int empId) {
		return null;
	}

	/**
	 * Create a map using the list, assign keys as names of the employee and value
	 * as the employee object
	 * 
	 * @param empList
	 * @return
	 */
	private static HashMap<String, Employee> convertListToMap(List<Employee> empList) {
		return null;
	}

	/**
	 * 
	 * Iterate the whole map and print botth keys and values
	 * 
	 * @param empMap
	 */
	private static void displayEmpMap(HashMap<String, Employee> empMap) {

	}

	/**
	 * Remove all the entries from the map where emp name is "Mohit"
	 * 
	 * @param empMap
	 * @param nameOfTheEmp
	 */
	private static void removeByNameFromMap(HashMap<String, Employee> empMap, String nameOfTheEmp) {

	}

	/**
	 * Remove all the duplicate entries from the list and return the list .
	 * 
	 * @param empList
	 * @return
	 */
	private static List<Employee> removeDuplicateEntriesFromList(List<Employee> empList) {

		return null;
	}

}
