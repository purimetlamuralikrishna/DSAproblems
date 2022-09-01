
class ReverseNumber{
	
	public static void main(String[] args){
	
		int value = 12345;
		int ans = reverseNumber(value);
		System.out.println(ans);
	}

	public static int reverseNumber(int num){

		int reverseInt = 0;
		
		while(num!=0){
			
			int i = num%10;
			reverseInt = reverseInt*10+i;
			num = num/10;
		}
		return reverseInt;
		
	}

}