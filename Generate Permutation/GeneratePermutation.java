import java.lang.*;
import java.util.*;

class GeneratePermutation{
    public static void main(String[] args){
      
        int n = 3;
        int[] arr = {1,2,3};
        generate(n,arr,0);
    }
    public static void generate(int n,int[] arr,int index){
     
		if(index>=n){
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i=index;i<n;i++){
			swap(arr,index,i);
			generate(n,arr,index+1);
			swap(arr,index,i);
		}
		   
    }

    public static void swap(int[] arr,int j,int i){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
    }
}