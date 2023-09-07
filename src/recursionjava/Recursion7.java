package recursionjava;
//Print subsequences:- "abc"

public class Recursion7 {
	public static void subsequences(String str,int index,String newString) {
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(index);
		 // 1. to be chosen
		subsequences(str,index+1,newString+currentChar);
		
		//2. to not be chosen
		subsequences(str,index+1,newString);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
subsequences(str,0,"");
	}

}

//Time Complexity:: O(2 power n)