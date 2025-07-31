//we get NumberFormatException when we try to parse a string which does not have a number format in it 

package parsing;

public class NumberFormatException
{
	public static void main(String[] args)
	{
		String s="we45";
		int  i=Integer.parseInt(s);//NumberFormatException
		System.out.println(i);

		String a="12345.6wer";
		double d=Double.parseDouble(a);//NumberFormatException
		System.out.println(d);


	}
}

