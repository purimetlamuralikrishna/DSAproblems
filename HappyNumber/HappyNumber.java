
class HappyNumber{
	public static void main(String[] args){
	
		int num = 19;
		String ans = isNumberHappy(num)?"Happy":"Not Happy";
		System.out.println(ans);
	}

	public static boolean isNumberHappy(int num){
	
		if(num==1){
			return true;
		}
	
		if(num<10){
			return false;
		}
		
		int sum = 0;
		while(num!=0){
			
			int i=num%10;
			sum += i*i;
			
			num = num/10;
		}
		System.out.println(sum);
		
		return isNumberHappy(sum);
		
	}
}