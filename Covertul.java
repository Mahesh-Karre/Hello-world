import java.util.*;
class Convertul
{
	static public void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char");
		char ch=sc.next().charAt(0);

		if(ch>=65&&ch<=90)
		{
			ch=(char)(ch+32);
			System.out.println(ch);
		
		}
	
		else if(ch>=97&&ch<==122)
		{
			ch=(char)(ch-32);		
			System.out.println(ch);
		}
	}
		
}	