/*
Given two strings s1 and s2, remove those characters from first string 
which are present in second string. Both the strings are different and contain 
only lowercase characters.
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is s1,s1 is first string.
The second line of each test case contains s2,s2 is second string.
*/

package strings;

import java.util.Scanner;

public class Problems4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String temp="";
	       for(int i=0;i<s1.length();i++)
	       {
	    	   String str=Character.toString(s1.charAt(i));
	    	   
	           if(s2.contains(str))
	           {
	               continue;
	           }
	           else
	           {
	               temp+=str;
	           }
	       }
	       System.out.println(temp);
	}
}
//geeksforgeeks
//mask
//geeforgee