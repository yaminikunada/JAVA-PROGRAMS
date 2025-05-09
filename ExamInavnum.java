import java.util.Scanner;
class InavNumber
{
  public static void main(String[] args)
  {
    Inav inavnumber = new Inav();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    inavnumber.num = sc.nextInt();
    inavnumber.sumCount();
    inavnumber.digiCount();
    inavnumber.inavN();
    String res = inavnumber.inavN();
    System.out.println( res);
  }
  
}

class Inav
{
  int num, rem, count, sum, temp =num;
  void sumCount()
  {
    while(num!=0)
    {
      rem = num%10;
      sum = sum+rem;
      count++;
      num = num/10;
    }
    System.out.println( sum);
    System.out.println(count);
  }
  
  int rem1, sum1;

  void digiCount()
  {
        
    while(sum>9)
    {
      sum1=0;
      while(sum!=0)
      {
        rem1 = sum%10;
        sum1 = sum1+rem1;
        sum = sum/10;
      }
      sum = sum1;
    }
    System.out.println(sum1);
  }
  
  String inavN()
  {
    if(sum==1)
      return ( "Inav Number");
    else 
      return ("is not an Inav Number");

  }
}