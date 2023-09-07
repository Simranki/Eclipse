package recursionjava;

public class Recursion4 {
// To check if the array is sorted(strictly increasing)
	public static boolean isSorted(int arr[],int index) {
		if(index==arr.length-1) {
			return true ;
		}
		if(arr[index]>=arr[index+1]) {
			return false;  	//means array is unsorted
		}
		else {
			return isSorted(arr,index+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,4};
System.out.println(isSorted(arr,0));
	}

}
// Time Complexity : - O(n);