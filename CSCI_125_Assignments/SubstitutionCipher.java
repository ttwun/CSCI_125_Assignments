//Create a class SubstitutionCipher that implements the interface MessageEncoder, as described in the previous exercise. 
//The constructor should have one parameter called shift. Define the method encode so that each letter is shifted by the 
//value in shift. For example, if shift is 3, a will be replaced by d, b will be replaced by e, c will be replaced by f, and so on. 
//Hint: You may wish to define a private method that shift a single character.

public class SubstitutionCipher implements MessageEncoder {
	
		int shift; 
		SubstitutionCipher (int shift){
			this.shift = shift;
		}
	
		private char shift (char ch, int Shift) {
			char shiftedChar = ch;
			if (ch >= 'a' && ch <= 'z') {
				shiftedChar = (char) (ch + Shift);
			}
			else if (ch >= 'A' && ch <= 'Z') {
				shiftedChar = (char) (ch + Shift);
			}
			return shiftedChar; 
		}
	    
	    public String encode(String plaintext){
	        String encodedMsg = "";
	        for(int i = 0; i < plaintext.length(); i++){
	            char ch = plaintext.charAt(i);
	            encodedMsg += shift(ch, shift);
	        }
	        return encodedMsg;
	    }
		
	    public static void main(String[] args) {
	    	SubstitutionCipher obj = new SubstitutionCipher(1);
	    	System.out.println(obj.encode("Hello"));
	    }
		

}
