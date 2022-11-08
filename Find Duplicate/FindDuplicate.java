import java.lang.*;
import java.util.*;

public class FindDuplicate{


	public static void main(String[] args){
		int[] subArr = {1,2,3,1,4};
		
		System.out.println(duplicateBruteforce(subArr));
	}



	public static int duplicateBruteforce(int[] arr) {
		
		
		for(int index:arr){
			if(arr[index-1]==-1) return index;

			arr[index-1] = -1;
		}

		return -1;
		
	}

}