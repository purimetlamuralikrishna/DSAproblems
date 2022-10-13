import java.lang.*;
import java.util.*;

class BubbleSort{
   public static void main(String[] args){
            
	    int n = 5;
	    int[] arr = {10,4,-8,7,5};
            bubbleSortAlgorithem(n,arr);
	    System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortAlgorithem(int n,int[] arr){
        
        for(int i=0;i<n-1;i++){
		boolean flag = true;
		
		for(int j=0;j<n-1-i;j++){
			if(arr[j]>arr[j+1]){
				swap(arr,j,j+1);
				flag = false;
			}
		}
	   if(flag)break;
		
	}
        
    }

    public static void swap(int[] arr,int i,int j){
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }
}