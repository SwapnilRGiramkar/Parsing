//This Program convert the String type of data into the Perticular datatype
package parsing;

public class StringToPrimitive 
{
	public static void main(String[] args) 
	{
		String s="true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		String a ="123.45";
		double d= Double.parseDouble(a);
		System.out.println(d);
		
		String c="123";
		int i=Integer.parseInt(c);
		System.out.println(i);
		
		String e="yu";
		char ch=e.charAt(1);
		System.out.println(ch);
		
		try
		{
			String l="123456";
			long z=Long.parseLong(l);
			System.out.println(z);
		}
		catch(NumberFormatException u)
		{
			System.out.println("Look the Format of Number in String Block");
		}
	}
}

