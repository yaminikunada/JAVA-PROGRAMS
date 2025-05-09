class Weekswitch
{
 public static void main (String args[])
 {
  int day=5;
  switch(day)
   {
     case 1:
             System.out.println(day+" week is MONDAY");
   	     break;
     case 2:
	     System.out.println(day+" week is TUESDAY");
   	     break;
     case 3:
             System.out.println(day+" week is WEDNESDAY");
   	     break;
     case 4:
             System.out.println(day+" week is THURSDAY");
   	     break;
     case 5:
             System.out.println(day+" week is FRIDAY");
   	     break;
     case 6:
             System.out.println(day+" week is SATURDAY");
   	     break;
     case 7:
             System.out.println(day+" week is SUNDAY");
   	     break;
     default:
             System.out.println(day+" invalid days");
   	     break;
    }
  }
}