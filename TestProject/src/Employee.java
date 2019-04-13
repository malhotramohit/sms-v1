public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		// if name same to salary
		if (this.getName().compareTo(emp.getName()) == 0) {
			if (this.getSalary() > emp.getSalary()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			if (this.getName().compareTo(emp.getName()) > 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}