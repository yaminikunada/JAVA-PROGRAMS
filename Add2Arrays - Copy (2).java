class Add2Arrays
{
	public static void main(String args[])
	{
	     int a[]={10,24,35,46,67};
	     int b[]={72,89,90};
	     int c[]=new int[a.length+b.length];
	     for(int x=0;x<=a.length-1;x++)
	      {
			c[x]=a[x];
	      }
	     for(int x=a.length,y=0;y<=b.length-1;x++)
	     {
		c[x]=b[y];
		y++;
	      }

	      for(int x=0;x<=c.length-1;x++)
	      {
		 System.out.println(c[x]);
	       }
          }

}
	