import java.util.Scanner;
class PerfectO
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int x=0;x<=a.length-1;x++)
		{
		    a[x]=sc.nextInt();
		}
		PerfectO p=new PerfectO();
		p.isCount(a);
		p.isPerfect(a);
		p.isNotPerfect(a);
	}
int isCount(int a[])
{
	int count=0;
	for(int x=0;x<=a.length-1;x++)
	{ 
	int sqrt=(int)Math.sqrt(a[x]);
	  if(sqrt*sqrt==a[x])
		count++;
	}
return count;
}
void isPerfect(int a[])
{
	int res=isCount(a);
	int b[]=new int[res];
	int y=0;
	for(int x=0;x<=a.length-1;x++)
	{ 
	int sqrt=(int)Math.sqrt(a[x]);
	  if(sqrt*sqrt==a[x])
	  {
		b[y]=a[x];
		y++;
	  }
	}
	for(int x=0;x<=b.length-1;x++)
	{ 
		System.out.println(b[x]);
	}
}
void isNotPerfect(int a[])
{
	int res1=isCount(a);
	int c[]=new int[a.length-res1];
        int z=0;
	for(int x=0;x<=a.length-1;x++)
	{ 
	int sqrt=(int)Math.sqrt(a[x]);
	  if(sqrt*sqrt!=a[x])
	  {
		c[z]=a[x];
		z++;
	  }
	}
	for(int x=0;x<=c.length-1;x++)
	{ 
		System.out.println(c[x]);
	}
}
}
	