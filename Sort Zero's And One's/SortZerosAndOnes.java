import java.util.*;


public class SortZerosAndOnes{

	public static void main(String[] args){
		
		int[] arr = {1,1,1,1,1,0,0,1,0,0};
		sortZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sortZeros(int[] arr){
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right){
			
			if(arr[right]==0){
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
			}

			else{
				right--;
			}
		}		
	}

	public static void sortZerosBruteForce(int[] arr){
		
		int zerosCount = 0;
		for(int value:arr){
			if(value==0) zerosCount++;
		}

		for(int i=0;i<arr.length;i++){
			
			if(i<zerosCount){
				arr[i]=0;
			}
			else{
				arr[i]=1;
			}
		}

	}

}