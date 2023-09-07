package recursionjava;
import java.util.*;

//Print all the unique subsequences of a string "aaa" -> aaa, aa, a, _;


public class Recursion8 {
public static void uniqueSubSequence(String str,int index,String newString,HashSet<String>set) {
	if(index==str.length()) {
		if(set.contains(newString)) {
			return;
		}
		else {
		System.out.println(newString);
		set.add(newString);
		return;
		}
		
	}
	char currentChar = str.charAt(index);
	//1. To be chosen
	uniqueSubSequence(str,index+1,newString+currentChar,set);
	//2. To not be chosen
	uniqueSubSequence(str,index+1,newString,set);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set=new HashSet<>();
		String str="aaa";
		uniqueSubSequence(str,0,"",set);
		

	}

}
//Time Complexity: - O(2 power n)