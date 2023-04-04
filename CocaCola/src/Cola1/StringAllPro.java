package Cola1;

import java.util.Arrays;
import java.util.TreeMap;

public class StringAllPro {

	public static void main(String[] args) {
		
		String str = "Java is a Good Programming Language"; 
		
		String[] s = str.split(" ");
		System.out.println(Arrays.toString(s));
		
		revStringLine(str);
		revStringWordsWise(s);
		revStringIndivisualWords(str);
		countVowelNConsonant(str);
		firstCapital(str);
		lastCapital(str);
		firstNLastCapital(str);
		countCharOccurance(str);
		
	}

	
	private static void revStringLine(String str) {
		for(int i=str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	private static void revStringWordsWise(String[] s) {
		String result = "";

		for(int i=s.length-1; i>=0; i--) {
			result+=s[i]+" ";
		}
		System.out.print(result);
		System.out.println();
	}
	
	
	private static void revStringIndivisualWords(String str) {
		String res = "";
	for(int i=str.length()-1; i>=0; i--) {
		 res+=str.charAt(i)+" ";
		}
	String[] rev = res.split(" ");
	String res1="";
	for(int j=rev.length-1; j>=0; j--) {
		res1+=rev[j]+" ";
	}
	System.out.println(res1);
	}
	
	private static void countVowelNConsonant(String str) {
		
		String s = str.toLowerCase();
		char[] ch = s.toCharArray();
		
		int vc=0, cc=0;
		for(int i=0; i<str.length(); i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			vc++;
		else
			cc++;
		}
		System.out.println("Vowel :"+vc+" "+"consonant :"+cc);
	}
	
private static void firstCapital(String str) {
//	"Java is a Good Programming Language"
	String s = str.toLowerCase();
	char[] ch = s.toCharArray();

	for(int i=0; i<ch.length; i++) {
		if((i==0 && ch[i]!=' ') || (ch[i]!=' '&& ch[i-1]==' ')) {
			if(ch[i]>='a' && ch[i] <= 'z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
	}
	System.out.println(ch);
}	
	
private static void lastCapital(String str) {
//	"Java is a Good Programming Language"
	String s = str.toLowerCase();
	char[] ch = s.toCharArray();
	
	for(int i=0; i<ch.length; i++) {
			if((i == ch.length-1 && ch[i]!=' ')|| (ch[i] != ' ' && ch[i+1]==' ')) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char)(ch[i]-32);
			}
		}
	}
	System.out.println(ch);
}

private static void firstNLastCapital(String str) {
	String s = str.toLowerCase();
	char[] ch = s.toCharArray();
	
	for(int i=0; i<ch.length; i++) {
		if((i==0 && ch[i]!=' ') || (ch[i]!=' '&& ch[i-1]==' ') || (i == ch.length-1 && ch[i]!=' ')|| (ch[i] != ' ' && ch[i+1]==' ')) {
			if(ch[i]>='a' && ch[i] <= 'z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
	}
	System.out.println(ch);
}

private static void countCharOccurance(String str) {
	String s = str.toLowerCase();
	String s1 = s.replace(" ", "");
	
	char[] ch = s1.toCharArray();
	TreeMap<Character, Integer> map =new TreeMap<Character, Integer>();
	int count=0;
	for(int i=0; i<ch.length; i++) {
		count=0;
		for(int j =0; j<ch.length; j++) {
			if(ch[i] == ch[j]) {
				count++;
			}	
		}
			map.put(ch[i], count);
	}
		System.out.print(map);
}

}
