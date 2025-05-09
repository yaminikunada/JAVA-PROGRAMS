class Samefactors
{
 public static void main(String args[])
 {
  int n1=6,n2=24,num=n1,max=1,least=0;
  int start=1,end=num;
   System.out.println("same factor of "+n1+" and "+n2+" is "); 
  while(start<=end)
  {
   if(n1%start==0 && n2%start==0)
     System.out.println(start);
     max=start;  
     least=
      
    start++;
   }
    System.out.println("largest same factor of "+n1+" and "+n2+" is "+max);
    System.out.println("least same factor of "+n1+" and "+n2+" is "+least);  
  
  }
  }
   