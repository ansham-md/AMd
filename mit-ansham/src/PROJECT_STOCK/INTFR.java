package PROJECT_STOCK;
import java.util.Scanner;
public class INTFR
{
	public static void mainza(String[] args)
	{
		//System.out.println("");
		System.out.println("Welcome to free stock calculator!");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter total number of shares: ");
		int total_shares=s.nextInt();
		
		System.out.println("Enter the price per share(P) / amount invested(A) as");
		System.out.println("P followed by price, Example P102.5 or ");
		System.out.print("A followed by amount, Example A15000 : ");
		try {
		String pporamt=s.next();
		System.out.println();
		double price_per_share=0.0;
		if(pporamt.startsWith("P"))
		{
			System.out.println("yes");
			price_per_share=Double.parseDouble(pporamt.substring(1,pporamt.length()));
		}
		System.out.println(price_per_share);
		} catch (Exception e) {}
	}
}
