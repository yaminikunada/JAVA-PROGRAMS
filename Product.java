class Products
{
	public static void main(String args[])
	{
	
          String pname="mobile";
          char pcode='m';
          int price=20000;
          byte quantity=3;
          double total=price*quantity;
         double  discount=0;
          if(total>50000)
	  
                discount=17/total*100;
	  else if(total<50000)
                  discount=5/total*100;
         
             float tax=10/price*100f;
        int deliverycharge=40;
	double coupons= 5*(total)/100;
        float finalprice=(float)(total-discount-tax-deliverycharge-coupons);
        System.out.println(finalprice);
       
        System.out.println(pname);   
        }
}
