import java.io.FileReader;
import java.io.FileNotFoundException;
class CodingHub
{
	public static void main(String args[]) throws FileNotFoundException
	{
		CodingHub ch=new CodingHub();
		ch.checked();
		ch.unchecked();
		
	}
		public void checked()throws FileNotFoundException
		{
			try{
				FileReader fr= new FileReader("C:\\Users\\yamin\\OneDrive\\Desktop\\credit.ipynb");
				System.out.println("file found successfully");
			   }catch(Exception e)
			   {
				System.out.println("file not found");
			   }

		}
		 public void unchecked()
		{
			try{
			System.out.println(10/0);
			}catch(Exception e)
			{
				System.out.println("iam in unchecked catch block");

			}
		}	




	
}