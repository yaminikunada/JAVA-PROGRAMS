class EmployeeExe
{
	public static void main(String ags[])
	{
		Employee e1=new Employee(1,"yam","it",10000);
		Employee e2=new Employee(2,"yami","nonit",20000);
		Employee e3=new Employee(3,"gam","hr",35000);
		Employee e4=new Employee(4,"kushh","it",60000);
		Employee e5=new Employee(5,"mini","finance",70000);
		System.out.println(e1+"\n"+e2+" \n"+e3+"\n "+e4+"\n "+e5);
	}
} 
class Employee
{
	int id;
	static String name;
	String dept;
	double salary;
	Employee(int id,String name,String dept,double salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString()
	{
		return("id-"+id+" name-"+name+" dept-"+dept+" salary-"+salary);
	}
}