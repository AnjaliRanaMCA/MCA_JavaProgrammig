class Person
{
	protected String name;
	public Person(String name)
	{
		this.name = name;	
	}
	public String getName()
	{
		return name;
	}

	public String toString()
	{

		return "PERSON [NAME=" + name + "]";
	}
}
class Employee extends Person
{
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo)
	{
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;

		this.nationalInsuranceNo = nationalInsuranceNo;
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	public int getYearOfJoining()
	{
		return yearOfJoining;
	}
	public String getNationalInsuranceNo()
	{
		return nationalInsuranceNo;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "EMPLOYEE DETAILS ARE AS FOLLOWS :- \n Name=" + name + "\n Year of Joining=" + yearOfJoining + "\n Annual Salary=" + annualSalary + "\n National Insurance No.="+ nationalInsuranceNo;

	}
}
class TestEmployee
{
	public static void main(String[] args)
{
	Employee emp = new Employee("John", 7000000, 2020,"abce");
	System.out.println(emp);
}

}