package recursionjava;

// Print keypad combination
public class Recursion9 {
public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void printKey(String str,int index,String combination) {
	if(index==str.length()) {
		System.out.println(combination);
		return;
	}
	char currentChar=str.charAt(index);
	String mapping=keypad[currentChar-'0'];
	for(int i=0;i<mapping.length();i++) {
		printKey(str,index+1,combination+mapping.charAt(i));
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="23";
		printKey(str,0,"");

	}

}

// Time Complexity:- O(4 power n) //because maximum choices could be 4