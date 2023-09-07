package recursionjava;
import java.util.*;

// Reverse a string
public class Recursion2 {

	public static void reverse(String str, int index) {
		if(index==0) {
		System.out.print(str.charAt(index));
		return;
		}
		
		System.out.print(str.charAt(index));
		reverse(str,index-1);
	}
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: - ");
String str= sc.nextLine();

reverse(str,str.length()-1);
	}

}

// Time Complexity:- O(n);