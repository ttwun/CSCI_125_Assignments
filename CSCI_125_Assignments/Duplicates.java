//Write a static method removeDuplicates(Character[] in) that returns a new array of the characters in the given array,
//but without any duplicate characters. Always keep the first copy of the character and remove subsequent ones. For
//example, if in contains b, d, a, b, f, a, g, a, a, and f, the method will return an array containing b, d a, f, and g. (Hint:
//One way to solve this problem is to create a boolean array of the same size as the given array in and use it to keep
//track of which characters to keep. The values in the new boolean array will determine the size of the array to return.)

import java.util.Arrays;
public class Duplicates {
	
	public static char[] removeDuplicates(char c[]){   
		char[] out = new char[c.length];
		int j = 0;  
			for (int i=0; i<c.length-1; i++){  
				if (c[i] != c[i+1]){  
					out[j++] = c[i]; 
				} 
			}  
			out[j++] = c[c.length-1];     
			
			for (int i=0; i<j;i++) {
				c[i] = out[i];
			}
			return out; 
	}
	
	public static void main (String[] args) {
		char[] t = {'a','b','c','c','d','d'}; 
		System.out.print(Arrays.toString(removeDuplicates(t)));
	}

	
} 
   