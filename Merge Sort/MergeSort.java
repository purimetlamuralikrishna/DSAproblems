import java.lang.*;
import java.util.*;

class MergeSort{
   public static void main(String[] args){
            
	    int n = 5;
	    int[] arr = {10,4,-8,7,-8};
	    mergeSort(n,arr);
            System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int n,int[] arr){
        
	//System.out.println(Arrays.toString(arr));

        if(n>1){
		int l = n/2;
		int leftArr[] = new int[l];
		int rightArr[] = new int[n-l];

		for(int i=0;i<l;i++) leftArr[i] = arr[i];
		int index = 0;
		for(int i=l;i<n;i++) rightArr[index++] = arr[i];
		
		mergeSort(leftArr.length,leftArr);
		mergeSort(rightArr.length,rightArr);
		
		
		mergeArrays(leftArr,rightArr,arr);

	}
        
    }

    public static void mergeArrays(int[] leftArr,int[] rightArr,int[] arr){
    	
	int i = 0;
	int j = 0;
	int pointer = 0;

	while(i<leftArr.length && j<rightArr.length){
		
		if(leftArr[i]<=rightArr[j]) arr[pointer++] = leftArr[i++];
		else arr[pointer++] = rightArr[j++];
	}

	while(i<leftArr.length)arr[pointer++] = leftArr[i++];
	while(j<rightArr.length)arr[pointer++] = rightArr[j++];
    }
}