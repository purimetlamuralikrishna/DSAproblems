import java.util.*;
class CheckPalindrome{

	public static void main(String[] args){

		String str = "abca";
		int left = 0;
		int right = str.length()-1;
		int chance = 1;
		String ans = validatePalindrome(str,left,right,chance)?"YES":"NO";
		System.out.println(ans);
	}
	public static boolean validatePalindrome(String str,int left,int right,int chance){
	
		if(chance<0){
			return false;
		}
		while(left<right){
			
			if(str.charAt(left)!=str.charAt(right)){
				return validatePalindrome(str,left,right-1,chance-1)||
					validatePalindrome(str,left+1,right,chance-1); 
			}
			right--;
			left++;
		}
		
		return true;
		
	}
	
}