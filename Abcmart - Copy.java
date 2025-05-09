import java.util.Scanner;
class Abcmall
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("welcome to the ABC mart");
		
		int ricetotal=0,pulsestotal=0,oiltotal=0,cookiestotal=0,stationarytotal=0;
		String a="0",b="0",c="0",d="0",e="0";
		 System.out.println("Available products are:"+"\n 1.Rice"+"\n 2.Pulses"+"\n 3.oil"+"\n 4.Cookies"+"\n 5.Stationary");
		while(true)
		{
		 System.out.println("choose the product you want to purchase:");
		int num=obj.nextInt();
		switch(num)
			{
				case 1:
					System.out.println("Rice"+"\n"+"Types:");
					 a="Black rice"; b="Brown rice"; c="Red rice";
					System.out.println("a."+a+"\n"+"b."+b+"\n"+"c."+c);
					System.out.println("Enter type:");
					char Type=obj.next().charAt(0);
					
					int rprice=0;
					if(Type=='a')
					{
						System.out.println(" Type you selected for rice is "+a);
					      rprice=60;
					}
					else if(Type=='b')
					{
						System.out.println(" Type you selected for rice is "+b);
						 rprice=65;
					}
					else if(Type=='c')
					{
						System.out.println(" Type you selected for rice is "+c);
						 rprice=70;
					}
					System.out.println("Enter quantity:");
					int r_quantity=obj.nextInt();
					ricetotal=r_quantity*rprice;
					System.out.println("your pay ammount  is "+ricetotal);
					System.out.println("____________________________________________________________");			
				
					break;
					
				case 2:
					System.out.println("pulses"+"\n"+"type");
					 a="Black Gram";b="Masoor Dal";c="Moong Dal";d="Rajma";e="Soyabeans";
					System.out.println("a."+a+"\nb. "+b+"\nc."+c+"\nd."+d+"\ne."+e);
					System.out.println("Enter type:");
					char type=obj.next().charAt(0);
					int price=0;
					if(type=='a' )
					{
						System.out.println(" Type you selected for pulses is "+a);
					      price=45;
					}
					else if( type=='b')
					{
						System.out.println(" Type you selected for pulses is "+b);
					      price=50;
					}
					else  if( type=='c')
					{
						System.out.println(" Type you selected for pulses is "+c);
					      price=35;
					}
					else if( type=='d')
					{
						System.out.println(" Type you selected for pulses is "+d);
					      price=60;
					}
					else if( type=='e')
					{
						System.out.println(" Type you selected for pulses is "+e);
					      price=80;
					}
					System.out.println("Enter quantity:");
					int p_quantity=obj.nextInt();
					pulsestotal=p_quantity*price;
					System.out.println("your pay ammount for "+type+" is "+pulsestotal);
					
					System.out.println("____________________________________________________________");			
				
					break;
							
				case 3:
					System.out.println("you choosed oil  category"+"\n"+"enter oil type");
					 a="Coconut oil";b="Peanut oil";c="sunflower oil";d="Almond oil";e="Palm oil";
					System.out.println("a."+a+"\nb. "+b+"\nc."+c+"\nd."+d+"\ne."+e);
					System.out.println("Enter type:");
					char otype=obj.next().charAt(0);
					int oprice=0;
					if(otype=='a') 
					{
						System.out.println(" Type you selected for oil is "+a);
					       oprice=60;
					}
					else if(otype=='b') 
					{
						System.out.println(" Type you selected for oil is "+b);
					       oprice=120;
					}
					else if(otype=='c') 
					{
						System.out.println(" Type you selected for oil is "+c);
					       oprice=190;
					}
					else if(otype=='d') 
					{
						System.out.println(" Type you selected for oil is "+d);
					       oprice=220;
					}
					else if(otype=='e') 
					{
						System.out.println(" Type you selected for oil is "+e);
					       oprice=70;
					}
					System.out.println("Enter quantity:");
					int o_quantity=obj.nextInt();
					oiltotal=o_quantity*oprice;
					System.out.println("your pay ammount for "+otype+" is "+oiltotal);
					
					System.out.println("____________________________________________________________");			
				
					break;
							
			     case 4:
					System.out.println("you choosed cookies  category"+"\n"+"enter coolies type");
					 a="Chocolate chip cookies";b="Peanut butter cookie";c="Wafer";d="Almond cookie";e="Pinwheel cookie";
					System.out.println("a."+a+"\nb. "+b+"\nc."+c+"\nd."+d+"\ne."+e);
					System.out.println("Enter type:");
					char ctype=obj.next().charAt(0);
					int cprice=0;
					if(ctype=='a' )
					{
						System.out.println(" Type you selected for cookies is "+a);
					      cprice=80;
					}
					else if(ctype=='b' )
					{
						System.out.println(" Type you selected for cookies is "+b);
					      cprice=90;
					}
					else if(ctype=='c' )
					{
						System.out.println(" Type you selected for cookies is "+c);
					      cprice=100;
					}
					else if(ctype=='d' )
					{
						System.out.println(" Type you selected for cookies is "+d);
					      cprice=150;
					}
					else if(ctype=='e' )
					{
						System.out.println(" Type you selected for cookies is "+e);
					      cprice=120;
					}
					System.out.println("Enter quantity:");
					int c_quantity=obj.nextInt();
					cookiestotal=c_quantity*cprice;
					System.out.println("your pay ammount for "+ctype+" is "+cookiestotal);
			
					System.out.println("____________________________________________________________");			
				
					break;
							
					
				 case 5:
					System.out.println("you choosed stationary  category"+"\n"+"enter stationary type");
					 a="Note book";b="pens";c="Calculater";d="Clipboard";e="Rubberstamp";
					System.out.println("a."+a+"\nb. "+b+"\nc."+c+"\nd."+d+"\ne."+e);
					System.out.println("Enter type:");
					char stype=obj.next().charAt(0);
					int sprice=0;
					if(stype=='a')
					{
						System.out.println(" Type you selected for stationary is "+a);
					       sprice=66;
					}
					else if(stype=='b')
					{
						System.out.println(" Type you selected for stationary is "+b);
					       sprice=10;
					}
					else if(stype=='c')
					{
						System.out.println(" Type you selected for stationary is "+c);
					       sprice=540;
					}
					else if(stype=='d')
					{
						System.out.println(" Type you selected for stationary is "+d);
					       sprice=30;
					}
					else if(stype=='e')
					{
						System.out.println(" Type you selected for pules is "+e);
					       sprice=40;
					}
					System.out.println("Enter quantity:");
					int s_quantity=obj.nextInt();
					stationarytotal=s_quantity*sprice;
					System.out.println("your pay ammount for "+stype+" is "+stationarytotal);
					
					System.out.println("____________________________________________________________");			
				
				      break;
							
			 }
			
		
			System.out.println("Do you want to purchase again: "+"\n enter Yes or NO options");	

			String option = obj.next().trim();
			if(option.equalsIgnoreCase("yes"))
			{			
			 System.out.println("Available products are:"+"\n 1.Rice"+"\n 2.Pulses"+"\n 3.oil"+"\n 4.Cookies"+"\n 5.Stationary");
			
			}
			 else if(option.equalsIgnoreCase("no"))
		      {
			  break;
			}
			else
				{
				System.out.println("invalid input");
				break;
				}
		}
		double totalbill=ricetotal+pulsestotal+oiltotal+cookiestotal+stationarytotal;//1280
		double discount=0,payment=0;
		if(totalbill>=1000)//1280>1000 t
		{
  		 discount=(20*totalbill)/100;
		}	
 		payment=totalbill-discount;
		System.out.println(" your total bill is: "+totalbill);//1280
		System.out.println("Discount given: "+discount+"%");
		System.out.println("after dicount your total payment is: "+payment);
		System.out.println("thank you for visiting");
					
		


	}
}			
		