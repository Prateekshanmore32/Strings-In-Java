/*
Given a String of length N reverse each word in it. Words are separated by dots.
Input:
The first line contains T denoting the number of testcases. 
Then follows description of testcases. Each case contains a string containing dots and characters.
*/ 

package strings;
import java.util.*;
public class Problem5 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		sc.nextLine();
		while(p-->0)
		{
        		String str=sc.nextLine();
        		String ans="";
                String s[]=str.split("[.]",0);       //split the string by dot
                for(int i=0;i<s.length;i++)
                {
                	String temp=s[i];
                	String t="";
                	for(int j=temp.length()-1;j>=0;j--)
                	{
                		t+=temp.charAt(j);
                	}
                	if(s.length==1|| i==s.length-1)
                	{
                		ans+=t;	
                	}
                	else
                	{
                		ans+=t+".";
                	}
                }
                System.out.println(ans);
		}
	}
}
//2
//i.like.this.program.very.much
//i.ekil.siht.margorp.yrev.hcum
//pqr.mno
//rqp.onm
