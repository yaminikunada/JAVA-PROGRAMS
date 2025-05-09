import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class OneFile
{
	public static void main(String args[])throws FileNotFoundException
	{
		File f= new File("C:\\Users\\yamin\\OneDrive\\Desktop\\one.txt");
		Scanner sc=new Scanner(f);
		int alpha=0,number=0,symbol=0;
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			for(int x=0;x<=s.length()-1;x++)
			{
				char ch=s.charAt(x);
				if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
					alpha++;
				else if(ch>='0' && ch<='9')
					number++;
				else
					symbol++;
			}		
							
		
		}
		System.out.println(alpha+" alphabets "+number+" numbers "+symbol+" symbols ");
	}
}