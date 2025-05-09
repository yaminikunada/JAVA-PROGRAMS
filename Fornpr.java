class Fornpr
{
 public static void main(String args[])
 { 
  int n=5,r=3,nr=n-r;
  int start=1,end=n,nproduct=1,nrproduct=1; 
   for(;start<=end;start++)
   {
     nproduct*=start;
    }
    System.out.println(n+" factorial is"+nproduct);
   
   for(int nrstart=1;nrstart<=nr;nrstart++)
   {
     nrproduct*=nrstart;
   }
    System.out.println(nr+" factorial is"+nrproduct);	
     System.out.println(n+"p"+r+" is"+nproduct/nrproduct);
  }
}