import java.lang.*;
import java.util.*;

class SelectionSort{
   public static void main(String[] args){
            
	    int n = 5;
	    int[] arr = {10,4,-8,7,5};
	    selectionSortAlgorithem(n,arr);
            System.out.println(Arrays.toString(arr));
    }

    public static void selectionSortAlgorithem(int n,int[] arr){
        
        for(int i=0;i<n-1;i++){
		int minValueIndex = i;

		for(int j=i+1;j<n;j++){
			if(arr[minValueIndex] > arr[j]) minValueIndex = j;
		}
		swap(arr,minValueIndex,i);
	}
        
    }

    public static void swap(int[] arr,int i,int j){
	
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }
}