import java.util.*;
class Commonset
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		HashSet<String> h1=new HashSet<String>();
		HashSet<String> h2=new HashSet<String>();
		System.out.println("Enter size for set 1");
		int n1=s.nextInt();
		
		System.out.println("Enter elements for set 1");
		for(int i=0;i<n1;i++)
		{
			String s1=s.next();
			h1.add(s1);
		}
		System.out.println("Set 1 Elements : "+h1);
		
		System.out.println("Enter size for set 2");
		int n2=s.nextInt();
		
		System.out.println("Enter elements for set 2");
		for(int i=0;i<n2;i++)
		{
			String s2=s.next();
			h2.add(s2);
		}
		System.out.println("Set 2 Elements : "+h2);
		
		h1.retainAll(h2);
		
		System.out.println("Common Set Elements : "+h1);
		
		
		
		
	}
}