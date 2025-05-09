class Npr
{
 public static void main(String args[])
 {
  int n=5,r=3,nr=n-r;
  int start=1,end=n,product=1;
  while(start<=end)
  {
   product=product*start;
   start++;
  }
  System.out.println(n+" factorial is"+ product);
  int nstart=1,nend=nr,nproduct=1;
  while(start<=end)
  {
   nproduct=nproduct*nstart;
   nstart++;
  }
  System.out.println(nr+" factorial is"+nproduct);
  System.out.println(n+"p"+r+"is"+(product/nproduct));
 }
}
