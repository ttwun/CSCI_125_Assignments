import java.util.Arrays;

//Write a static method remove(intv,int[] in) that will return a new array of the integers in the given array, but with the
//value v removed. For example, if v is 3 and in contains 0, 1, 3, 2, 3, 0, 3, and 1, the method will return an array
//containing 0, 1, 2, 0, and 1.

public class Remove {
	 static int[] remove (int v, int[] n) {
		 int[] out = new int[n.length]; 
		
	        for (int i = 0, k = 0; i < n.length; i++) { 
	
	            if (v == n[i]) { 
	                continue;
	            } 
	            out[k++] = n[i];
	        }
	        return out;
	            
	 }
	 public static void main (String[] args) {
			int[] t = {1,2,2,3,3}; 
			System.out.print(Arrays.toString(remove(3,t)));
	}
}

