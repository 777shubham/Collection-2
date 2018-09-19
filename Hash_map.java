import java.util.*;
class Hash_map
{
	public static void main(String ars[])
	{
	Scanner s=new Scanner(System.in);
	HashMap<Integer,String> h=new HashMap<Integer,String>();//Arrange in sorted manner based on Integer value
	System.out.println("Enter size for HashMap");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter "+i+" Number:");
		int num=s.nextInt();
		System.out.println("Enter "+i+" String:");
		String s1=s.next();
		h.put(num,s1);
	}
	System.out.println("Output");
	for(Map.Entry x:h.entrySet())//entrySet() is used to return a collection view of the mappings contained in h map.
	{  
		System.out.println(x.getKey()+" "+x.getValue());  
    }  
	
	}
}