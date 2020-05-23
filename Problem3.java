/*
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password.
However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
Its length is at least 

. 
It contains at least one digit. 
It contains at least one lowercase English character. 
It contains at least one uppercase English character. 
It contains at least one special character. The special characters are: !@#$%^&*()-+ 
She typed a random string of length 

in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?
Note: Here's the set of types of characters in a form you can paste in your solution:
numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
*/

package strings;
import java.util.*;
public class Problem3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		int need=0;
		int x=6-n;
		int f1=0;
			for(int i=0;i<str.length();i++)
			{
				if(Character.isDigit(str.charAt(i)))
				{
					f1=1;
					break;
				}
			}
			if(f1==0)
			{
				need++;
			}
			int f2=0;
			for(int i=0;i<str.length();i++)
			{
				if(Character.isLowerCase(str.charAt(i)))
				{
					f2=1;
					break;
				}
			}
			if(f2==0)
			{
				need++;
			}
			int f3=0;
			for(int i=0;i<str.length();i++)
			{
				if(Character.isUpperCase(str.charAt(i)))
				{
					f3=1;
					break;
				}
			}
			if(f3==0)
			{
				need++;
			}
			int f4=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='!'||str.charAt(i)=='@'||str.charAt(i)=='#'||str.charAt(i)=='%'||str.charAt(i)=='^'||str.charAt(i)=='&'||str.charAt(i)=='*'||str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)=='-'||str.charAt(i)=='+')
				{
					f4=1;
					break;
				}
			}
			if(f4==0)
			{
				need++;
			}
		System.out.println(Math.max(need, x));
	}

}

//5
//E!%Z@
//2
