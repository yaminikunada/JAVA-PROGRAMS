class Constructor
{
	public static void main(String args[])
	{
		Cons c=new Cons();
		c.printSum();
		Cons c1=new Cons(11,"gay","A",30,45,79);
                c1.printSum();

	}
}
class Cons
{
	int id;
	String name,section;
	int m1,m2,m3;
	double percentage,total;
	Cons()
	{
		id=10;
		name="yam";
		section="a";
		m1=55;
		m2=60;
		m3=70;
		total=total;
		percentage=percentage;
	}
	Cons(int id,String name,String section,int m1,int m2,int m3)
	{
		this.id=id;
		this.name=name;
		this.section=section;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.total=total;
		this.percentage=percentage;

	}

	void printSum()
	{
		total=m1+m2+m3;
		percentage=(total/300)*100;

		System.out.println(id+" "+name+" "+" "+section+" "+percentage);
	}
}

		