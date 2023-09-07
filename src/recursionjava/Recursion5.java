package recursionjava;
//Moving the element to the end
public class Recursion5 {
public static void end(String str,int index,int count,String newString,char element) {
	

if(index==str.length()) {
	for(int i=0;i<count;i++) {
		newString+=element;
		System.out.println(newString);
	}
		
	
	return;
}
char currentElement=str.charAt(index);
if(currentElement==element) {
	count++;
	end(str,index+1,count,newString,element);
}
else {
	newString=newString+currentElement;
	end(str,index+1,count,newString,element);
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="axbcxxd";   //Output: "abcdxxx"

end(str,0,0,"",'x');
	}

}

//Time Complexity: - O(n)
