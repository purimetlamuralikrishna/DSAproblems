import java.util.*;
class SumPairExistsOrNot{

	public static void main(String[] args){

		int[] arr = {1,5,9,9,5,2};
		int sum = 17;
		String ans = isPairExistsOrNot(arr,sum)?"Pair Exists":"No Pair Exists";
		System.out.println(ans);
	}
	public static boolean isPairExistsOrNot(int[] arr,int sum){
		
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		
		while(left<right){
			
			int num = arr[left]+arr[right];
			if(num==sum){
				return true;
			}
			else if(num<sum){
				left++;;
			}
			else{
				right--;
			}
		}
		return false;
	}
}