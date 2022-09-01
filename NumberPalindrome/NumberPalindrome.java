
class NumberPalindrome{
	
	public static void main(String[] args){
	
		int num = 101;
		String ans = isPalindrome(num)?"True":"False";
		System.out.println(ans);
	}
	public static boolean isPalindrome(int num){
		
		boolean ans = false;
		int value = num;
		
		if(num>=0){
		int reverseInt = 0;
		while(num!=0){
			int i = num%10;
			reverseInt = reverseInt*10+i;
			num = num/10;
		}
		ans = value==reverseInt?true:false;
		}

		return ans;
		
	}
}