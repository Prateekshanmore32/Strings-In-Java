package strings;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {

			/*
			 *       aba & aab->anagram
			 *       aabb & bbba->not anagram
			 */
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int al[]=new int[256];
		int bl[]=new int[256];
		boolean isAnagram=true;
		for(int i=0;i<a.length();i++)
		{
			int index=(int)a.charAt(i);
			al[index]++;
		}
		for(int i=0;i<b.length();i++)
		{
			int index=(int)b.charAt(i);
			bl[index]++;
		}
		for(int i=0;i<256;i++)
		{
			if(al[i]!=bl[i])
			{
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}

	}

}
//aab
//aba
//Anagram


//aaa
//bbb
//Not anagram
