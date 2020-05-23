package strings;

public class StringsFunction {

	public static void main(String[] args) {
			String name="Prateeksha N More";
			System.out.println("Char At 5 "+name.charAt(5));
			System.out.println("Length "+name.length());
			System.out.println("Substring from index at perticular index till last "+name.substring(5));
			System.out.println("Substring from beg to end "+name.substring(5, 10));
			System.out.println("Contains "+name.contains("N More"));
			System.out.println("Is Empty "+name.isEmpty());
			System.out.println("Concat "+name.concat("superwomen"));
			System.out.println("Replace "+name.replace('e', 'i'));
			String n[]=name.split("e");
			for(int i=0;i<n.length;i++)
			{
				System.out.print(n[i]+" ");
			}
			String temp="Advait mugale";
			System.out.println("Index of "+ temp.indexOf("m"));
			System.out.println("Lowercase "+temp.toLowerCase());
			System.out.println("Upeercase "+temp.toUpperCase());
			String temp2="       Prateekha           ";
			System.out.println("With space "+temp2);
			System.out.println("Without space "+temp2.trim());
	}

}
//Char At 5 e
//Length 17
//Substring from index at perticular index till last eksha N More
//Substring from beg to end eksha
//Contains true
//Is Empty false
//Concat Prateeksha N Moresuperwomen
//Replace Pratiiksha N Mori
//Prat  ksha N Mor Index of 7
//Lowercase advait mugale
//Upeercase ADVAIT MUGALE
//With space        Prateekha           
//Without space Prateekha
