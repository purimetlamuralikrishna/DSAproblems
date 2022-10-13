import java.lang.*;
import java.util.*;

class QuickSort{
   public static void main(String[] args){
            
	    int n = 5;
	    int[] arr = {10,4,-8,7,-8};
            quickSort(0,n-1,arr);
            System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int start,int end,int[] arr){
        
        if(start<end){
	
		int pivot = findPivot(start,end,arr);
		quickSort(start,pivot-1,arr);
		quickSort(pivot+1,end,arr);
	}
    }
    
    public static int findPivot(int start,int end,int[] arr){
	
	int value = arr[end];
	int pivot = start;
	
	while(start<end){
		
		if(arr[start]<=value){
			swap(arr,start,pivot);
			pivot++;
		}
		start++;
	}
	swap(arr,end,pivot);
	return pivot;
    }

    public static void swap(int[] arr,int i,int j){
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }
}