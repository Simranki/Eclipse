package recursionjava;
 
//Remove duplicates: - "abbccda" -> "abcd"
public class Recursion6 {
public static boolean[] map=new boolean[26];
public static void removeDuplicates(String str, int index, String newString) {
	if(index==str.length()) {
		System.out.println(newString);
		return;
	}
	char currentChar= str.charAt(index);
	if(map[currentChar-'a']==true) {
		removeDuplicates(str,index+1,newString);
	}
	else {
		newString=newString+currentChar;
		map[currentChar-'a']=true;
		removeDuplicates(str,index+1,newString);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abbccda";
removeDuplicates(str,0,"");
	}

}

//Time Complexity : - O(n);