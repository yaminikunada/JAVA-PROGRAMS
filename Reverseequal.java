class  Reverse
{
 public static void main(String args[])
  {
     int num=124500,rem=0,reverse=0,temp=num,count=0,rcount=0,ncount=0;
       
        while(num!=0)
	{
          rem=num%10;
	  reverse=reverse*10+rem;
	  num=num/10;
         count++;
        }
       while(reverse!=0)
       {
         rem=reverse%10;//1 2 4 5
         num=num*10+rem;//0+1 1 10+2 12  124 1245
	 reverse=reverse/10;//542 54 5
 	 rcount++;
         ncount=count-rcount;
        }
        while(ncount>0)//2>0 1>0 0>0
        {
         
		 num=num*10+0;
		
            	
   	 ncount--;1 0
   	} 
       System.out.println(num==temp?+num+"equal":+num+"not equal");
       
   }
}
		



	