package GoldenTch;
import java.util.*;
#inna thala
class checker
{
	public int nineck(int i)
	{
		int nine=i,d;
		while(nine>0)
		{
			d=nine%10;
			if(d==9)
				return(1);
			nine/=10;
		}
		return 0;
	}
}
public class tcsadvcoding1
{
	public static void main(String[] args)
	{
		checker obj=new checker();
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int num,max=0,maxno;
		String answer="null ";
		for(int i=0;i<T;i++)
		{
				max=0;maxno=0;
				String S=s.nextLine();
				String m[]=S.split(" ");
				for(int j=0;j<m.length;j++)
				{
					//System.out.println(m[j]);
					try
						{
							num=Integer.parseInt(m[j]);
							int check=0;
							check=obj.nineck(num);
							if(check==1)
								max=0;
							else
							{
								if(num>max)
									{max=num;
									maxno=num;}
							}
						}
					catch(Exception e) {}
				}
				if(max==0 && maxno==0)
				answer+="-1"+" ";
				else
				answer+=Integer.toString(maxno)+" "; 
			} s.close();
		String ans[]=answer.split(" ");
		for(int j=0;j<ans.length;j++)
		{
			if(ans[j].compareTo(" ")==0||ans[j].compareTo("null")==0)
				continue;
			else
				System.out.println(Integer.parseInt(ans[j]));
		}
	}
}

