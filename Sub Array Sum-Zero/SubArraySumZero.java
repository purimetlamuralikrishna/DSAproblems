import java.lang.*;
import java.util.*;

public class SubArraySumZero{


	public static void main(String[] args){
		int[] subArr = {4,-6,0};
		
		System.out.println(findSubarrSum(subArr));
	}



	public static boolean findSubarrSum(int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		set.add(0);
		for(int value:arr) {
			System.out.println(set);
			sum += value;
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		
		
		return false;
	}

}