class Printdigits
{
  public static void main(String args[])
  {
	int num=124500,rem=0,reverse=0,temp=num,count=0,rcount=0,ncount=0;
       	     while(num!=0)//1245 124
	     {
		  rem=num%10;// 5 4 2 1
		  reverse=reverse*10+rem;// 5 54 542 5421
		  num=num/10; //124 12 1 0
        	  count++;// 1 2 3 4 5 6
      	     }  
         
         while(reverse!=0)//21 2 54254 5
	{
	  rem=reverse%10;//1 2  4  5
	  num=num*10+rem;
	  reverse=reverse/10;//542 54 5 0
  	  rcount++;//1 2 3 4
	  ncount=count-rcount;//6-4
           
	}
        while(ncount>0) //2
	 {
             num=num*10+0;//12450
             System.out.println(num);
           ncount--;
 	 }
           
      
  }
}      