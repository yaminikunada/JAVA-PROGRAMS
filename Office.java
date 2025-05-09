class Office
{
	
	public static void main(String args[])
	{
	
	 Employee e1;
	 e1=new Employee();
	 e1.pname="yam";e1.salary=15000;e1.dept='a';e1.exp=2;
	System.out.println(e1.pname+" "+e1.salary+" "+e1.dept+" "+e1.exp);
	 Employee e2=new Employee();
	  e2.pname="gay";e2.salary=17000;e2.dept='b';e2.exp=3;
	System.out.println(e2.pname+" "+e2.salary+" "+e2.dept+" "+e2.exp);
	 Employee e3=new Employee();
	  e3.pname="ram";e3.salary=20000;e3.dept='a';e3.exp=1;
		System.out.println(e3.pname+" "+e3.salary+" "+e3.dept+" "+e3.exp);
	 Employee e4=new Employee();	
	  e4.pname="raki";e4.salary=25000;e4.dept='b';e4.exp=4;
	}
}
class Employee
{
	String pname;
	int salary;
	char dept;
	int exp;
}
	


class Sum
{
	int roll;
	String name;
     public static void main(String args[])
	{
		Sum s1=new Sum();
	      Sum s2=new Sum();
		s1.roll=10;s1.name="yam";
            System.out.println(s1.roll+" "+s1.name);
	}
}


//example 3
class Check
{
	bye b;
	short s;
	int i;
	String st;
	char c;
	double d;
	float f;
	long l;
      public static void main(String args[])
	{
		Check c1=new Check();
		System.out.println(c1.b+" "+c1.s+" "+c1.i+" "+c1.l+" "+c1.c+" "+c1.f+" "+c1.d+" "+c1.st);
	}
}
		