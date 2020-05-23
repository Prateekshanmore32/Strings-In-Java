//Alice wrote a sequence of words in CamelCase as a string of letters, 
//
//, having the following properties:
//It is a concatenation of one or more words consisting of English letters.
//All letters in the first word are lowercase. 
//For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
//Given 
//
//, print the number of words in 
//
//on a new line.
//For example, 
//
//
//
//. There are 
//
//words in the string. 

package strings;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=" ";
			if(s.length()==0)
			{
				System.out.println(0);
			}
			else
			{
				int count =1;
				for(int i=0;i<s.length();i++)
				{
					if(Character.isUpperCase(s.charAt(i)))
					{
						count++;
					}
				}
				System.out.println(count);
			}

	}

}
