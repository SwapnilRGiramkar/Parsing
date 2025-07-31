//This pRogram gives Conversion of Primitive data into the String.
package parsing;

public class PrimitiveToString 
{
	public static void main(String[] args) 
	{
		int i=13;
		String ans=String.valueOf(i);
		System.out.println(ans);
		
		String ans2=String.valueOf(false);
		System.out.println(ans2);
		System.out.println(ans2+true);
		
		long l=12345l;
		String ans3=String.valueOf(l);
		System.out.println(ans3);
		System.out.println(ans3+98);
	}
}

