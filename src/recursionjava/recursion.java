package recursionjava;
//import java.util.*;
// Tower Of Hanoi Problem
public class recursion {
public static void towerOfHanoi(int noofDisks, String src, String helper, String dest) {
	if(noofDisks==1) {
		System.out.println("Transfer disk "+noofDisks+" from "+src+" to "+dest);
		return;
	}
	towerOfHanoi(noofDisks-1, src,dest,helper);
	System.out.println("Transfer disk "+noofDisks+" from "+src+" to "+dest);
	
	
	towerOfHanoi(noofDisks-1,helper,src,dest);
	
	
}
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the no.of Disks");
		int noofDisks=3;
		
		towerOfHanoi(noofDisks,"S","H","D");
		
	}

}
//Time Complexity:- O(2 power n)