class Sumcount
{
 public static void main(String[] args)
 {
  int num=1578,temp=num,count=0;
   
    while(num!=0)//15789 1578 157 15 1 0=f
    {
     count++;//1 2 3 4 5
     num=num/10;//157 15 1 0
    }
     System.out.println("count is "+count); //4 5
    
    if(count%2==0)//4%2=0 t  5%2=0 f
    {
       int rem=0,sum=0;
        rem=temp%100;//157895%100=95
        sum=num+rem;//95+1578
       num=temp/100;//
        System.out.println("sum of even digits "+sum); 
       System.out.println(rem);  
    }
     
    else
     {
      int rem=0,o_sum=0;
       num=temp;//15789
       rem=num%10;//9
       o_sum= num +rem;//1578+9
       num=num/10;//1578
         
        System.out.println("sum of odd digits "+o_sum);
       System.out.println(num);  
       System.out.println(rem); 
      }
  
    
 }
}
      
     